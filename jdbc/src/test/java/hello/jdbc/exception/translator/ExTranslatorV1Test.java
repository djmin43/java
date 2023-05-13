package hello.jdbc.exception.translator;

import hello.jdbc.connection.ConnectionConst;
import hello.jdbc.domain.Member;
import hello.jdbc.repository.ex.MyDbException;
import hello.jdbc.repository.ex.MyDuplicateKeyException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.support.JdbcUtils;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

import static hello.jdbc.connection.ConnectionConst.*;

@Slf4j
public class ExTranslatorV1Test {

    @RequiredArgsConstructor
    static class Repository {
        private final DataSource dataSource;

        Repository repository;
        Service service;

        @BeforeEach
        void init() {
            DriverManagerDataSource dataSource = new DriverManagerDataSource(URL, USERNAME, PASSWORD);
            repository = new Repository(dataSource);
            service = new Service(repository);
        }

        @Test
        void duplicateKeySave() {
            service.create("myId");
            service.create("myId");
        }

        @Slf4j
        @RequiredArgsConstructor
        static class Service {
            private final Repository repository;

            public void create(String memberId) {
                try {
                    repository.save(new Member(memberId, 0));
                    log.info("saveId={}", memberId);
                } catch (MyDuplicateKeyException e) {
                    log.info("키 중복, 복구 시도");
                    String retryId = generateId(memberId);
                    log.info("retryId={}", retryId);
                    repository.save(new Member(retryId, 0));
                } catch (MyDbException e) {
                    log.info("데이터 접근 계층 예외", e);
                    throw e;
                }
            }

            private String generateId(String memberId) {
                return memberId + new Random().nextInt(10000);
            }

        }


        public Member save(Member member) {
            String sql = "insert into member(member_id, money) values(?,?)";
            Connection con = null;
            PreparedStatement pstmt = null;

            try {
                con = dataSource.getConnection();
                pstmt = con.prepareStatement(sql);
                pstmt.setString(1, member.getMemberId());
                pstmt.setInt(2, member.getMoney());
                pstmt.executeUpdate();
                return member;
            } catch (SQLException e) {
                //h2 db
                if (e.getErrorCode() == 23505) {
                    throw new MyDuplicateKeyException(e);
                }
                throw new MyDbException(e);
            } finally {
                JdbcUtils.closeStatement(pstmt);
                JdbcUtils.closeConnection(con);
            }
        }


    }

}
