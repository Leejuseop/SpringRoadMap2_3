package hello.core.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import hello.core.AppConfig;
import hello.core.member.MemberService;

public class singletonTest {

    @Test
    public void pureContianer(){
        AppConfig appConfig = new AppConfig();

        MemberService memberService1 = appConfig.memberService();
        MemberService memberService2 = appConfig.memberService();

        System.out.println("MemberService1 = " + memberService1);
        System.out.println("MemberService2 = " + memberService2);

    }

    @Test
    public void singletonServiceTest(){
        singletonService singletonService1 = singletonService.getInstance();
        singletonService singletonService2 = singletonService.getInstance();

        System.out.println("singletonService1 = " + singletonService1);
        System.out.println("singletonService2 = " + singletonService2);

    }

    @Test
    public void springContainer(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

        MemberService memberService1 = ac.getBean("memberService", MemberService.class);
        MemberService memberService2 = ac.getBean("memberService", MemberService.class);

        System.out.println("MemberService1 = " + memberService1);
        System.out.println("MemberService2 = " + memberService2);
    }
}
