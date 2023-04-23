package hello.jdbc.repository;

import hello.jdbc.connection.DBConnectionUtil;
import hello.jdbc.domain.Member;
import lombok.extern.slf4j.Slf4j;

import java.sql.*;

/**
 * JDBC - DriverManager 사용
 */
@Slf4j
public class MemberRepositoryV0 {

    public Member save(Member member) throws SQLException {
        String sql = "insert into member(member_id, money) values(?, ?)";

        Connection conn = null;
        PreparedStatement pstmt = null;


        try {
            conn = getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, member.getMemberId());
            pstmt.setInt(2, member.getMoney());
            return member;
        } catch (SQLException e) {
            log.error("db error", e);
            throw e;
        } finally {
            close(conn, pstmt, null);
        }
    }


    private void close(Connection conn, Statement stmt, ResultSet resultSet) {
        if (stmt != null) {
            try {
                stmt.close(); //Exception
            } catch (SQLException e) {
                log.info("error", e);
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                log.info("error", e);
            }

        }
    }

    private Connection getConnection() {
        return DBConnectionUtil.getConnection();
    }


}
