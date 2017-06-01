package com.mlhoste.magicpony.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String displayHome(@RequestParam(value = "login", required = false) String login, Model model) {
        model.addAttribute("login", login);
        return "home";
    }
}
