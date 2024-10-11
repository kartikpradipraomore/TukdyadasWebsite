package com.tukdyadas.Controllers;


import com.tukdyadas.POJO.User;
import com.tukdyadas.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PageController {

    @Autowired
    private UserService userService;

    @GetMapping("/home")
    public String home() {
        return "home";
    }






    @PostMapping("/addUser")
    public String addUser() {
        try{

            userService.addUser(new User());

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "redirect:/home";
    }

}
