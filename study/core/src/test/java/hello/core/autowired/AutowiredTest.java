package hello.core.autowired;

import hello.core.AppConfig;
import hello.core.member.Member;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.lang.Nullable;

import java.util.Optional;

public class AutowiredTest {
//
//    @Test
//    void AutowiredOption() {
//        ApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);
//    }
//
//    static class TestBean {
//
//        @Autowired(required = false)
//        public void setNoBean1(Member noBean1) {
//            System.out.println("noBean1 = " + noBean1);
//        }
//        @Autowired(required = false)
//        public void setNoBean2(@Nullable Member noBean2) {
//            System.out.println("noBean1 = " + noBean2);
//        }
//        @Autowired
//        public void setNoBean3(Optional<Member> noBean3) {
//            System.out.println("noBean1 = " + noBean3);
//        }
//    }
}
