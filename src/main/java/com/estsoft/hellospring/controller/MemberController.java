package com.estsoft.hellospring.controller;

import com.estsoft.hellospring.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MemberController {
//    @GetMapping("/members")
//    @ResponseBody
//    public String getAllMembers(){
//        return "";
//    }
    private final MemberService memberService;

    public MemberController(MemberService memberService){

        this.memberService = memberService;
    }
    @GetMapping("/members")
    @ResponseBody
    public List<MemberDTO> getAllMembers(){
            return memberService.getAllMembers();
    }
}
