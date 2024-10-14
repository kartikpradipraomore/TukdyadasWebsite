package com.tukdyadas.Controllers;


import com.tukdyadas.POJO.User;
import com.tukdyadas.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PageController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/gramgita")
    public String gramgita() {
        return "gramgita";
    }

    @GetMapping("/bhajan")
    public String bhajan() {
        return "bhajan";
    }

    @GetMapping("/sahitya")
    public String sahitya() {
        return "sahitya";
    }

    @GetMapping("/galary")
    public String galary() {
        return "galary";
    }

    @GetMapping("/hamare")
    public String hamare() {
        return "hamare";
    }

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("user", new User());
        return "/login";

    }


    @GetMapping("/error")
    public String error(Model model) {

        return "/error";
    }


}
