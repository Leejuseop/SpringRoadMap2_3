package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{
    public int discount(Member member, int price){
        if(member.getGrade() == Grade.VIP){
            return 1000;
        }
        else{
            return 0;
        }
    }
}
