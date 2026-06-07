package com.example.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class PageController {

    @GetMapping({"/", "/index"})
    public String index(Model model, Principal principal) {
        model.addAttribute("username", principal.getName());
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/user/home")
    public String userHome() {
        return "user";
    }

    @GetMapping("/admin/home")
    public String adminHome() {
        return "admin";
    }

    @GetMapping("/denied")
    public String denied() {
        return "denied";
    }
}
