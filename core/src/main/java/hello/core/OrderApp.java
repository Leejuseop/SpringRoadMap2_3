package hello.core;

import hello.core.member.*;
import hello.core.order.*;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService  = new MemberServiceImpl();
        OrderService newOrder = new OrderServiceImpl();

        Member juseop = new Member(1L, "juseop", Grade.VIP);
        memberService.join(juseop);

        Order order = newOrder.createOrder(1L,"book",10000);
        System.out.println("order" + order);
    }
}
