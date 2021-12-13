package org.kosta.cosmos.controller;

import org.kosta.cosmos.domain.MemberDTO;
import org.kosta.cosmos.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MemberController {

    private MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    /*
    @GetMapping("getMemberList")
    public String getMemberList(Model model) {
        List<MemberDTO> memberList = memberService.getMemberList();
        model.addAttribute("memberList", memberList);
        return "member-list";
    }
     */

    // 안녕하세요 저는 김중혁입니다.스터디룸예약이 22분남았네요 . 내일은 우리 쉬도록 해요^^
}
