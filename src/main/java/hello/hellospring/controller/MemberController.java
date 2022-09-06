package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    //    @Autowired private MemberService memberService;   // 필드 주입 방법 - 권장하지 않음.

    @GetMapping("/members/new")
    public String createForm() {
            return "members/createMemberForm";
    }
}

