package org.kosta.cosmos.controller;

import lombok.RequiredArgsConstructor;
import org.kosta.cosmos.config.auth.dto.SessionMember;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@Controller
public class HomeController {

    private final HttpSession httpSession;

    @GetMapping("/")
    public String home(Model model) {
        SessionMember member = (SessionMember) httpSession.getAttribute("member");
        if(member != null) {
            model.addAttribute("member", member);
        }


        return "index";
    }
}
