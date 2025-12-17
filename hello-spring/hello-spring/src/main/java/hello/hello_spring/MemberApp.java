package hello.hello_spring;

import hello.hello_spring.Grade;
import hello.hello_spring.Member;
import hello.hello_spring.MemberService;
import hello.hello_spring.MemberServiceImpl;


public class MemberApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find member = " + findMember.getName());
    }
}
