package com.example.Practice.controller;
import com.example.Practice.model.User;
import com.example.Practice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping({"/login"})
    public String Submit(@ModelAttribute User u, HttpSession session) {
        System.out.println(u);
        userRepository.save(u);
        session.setAttribute("message", "successful login");
        return "redirect:/";
    }
}
