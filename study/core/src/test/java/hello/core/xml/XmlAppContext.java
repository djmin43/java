package hello.core.xml;

import hello.core.member.Member;
import hello.core.member.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

public class XmlAppContext {

    @Test
    void xmlAppContext() {
        GenericXmlApplicationContext ac = new GenericXmlApplicationContext("appConfig.xml");
        Member memberService = ac.getBean("memberService", Member.class);
        assertThat(memberService).isInstanceOf(MemberService.class);
    }
}
