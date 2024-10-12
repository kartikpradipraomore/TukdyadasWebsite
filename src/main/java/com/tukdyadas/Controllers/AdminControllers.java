package com.tukdyadas.Controllers;

import com.tukdyadas.POJO.User;
import com.tukdyadas.Service.UserService;
import com.tukdyadas.helper.Message;
import com.tukdyadas.helper.MessageType;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/tukdyadas/admin")
public class AdminControllers {

    @Autowired
    private UserService userService;

    @GetMapping("/signup")
    public String signup(Model model) {
        model.addAttribute("user", new User());
        return "admin/signup";

    }

    @PostMapping("/add")
    public String addUser(@Valid @ModelAttribute("user") User user, Model model, BindingResult bindingResult, HttpSession session) {

        if(bindingResult.hasErrors()) {
            return "admin/signup";
        }

        try{
            userService.addUser(user);

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Giving Message to View
        Message message = Message.builder().content("Registration Successful").type(MessageType.green).build();
        session.setAttribute("message", message);

        return "redirect:/tukdyadas/admin/signup";

    }

















    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("user", new User());
        return "admin/login";

    }

}
