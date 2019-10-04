package com.victolee.signuplogin.controller;

import com.victolee.signuplogin.dto.MemberDto;
import com.victolee.signuplogin.service.MemberService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class MemberController {
    private MemberService memberService;

    @GetMapping("/signup")
    public String dispSignup() {
        return "/signup";
    }

    @PostMapping("/signup")
    public String execSignup(MemberDto memberDto) {
        memberService.joinUser(memberDto);
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String dispLogin() {
        return "/login";
    }

    @PostMapping("/login")
    public String execLogin() {
        return "redirect:/login/result";
    }

    @GetMapping("/login/result")
    public String dispLoginResult() {
//        if(성공) {
//            return "/loginSuccess";
//        }
        return "redirect:/login";
    }
}
