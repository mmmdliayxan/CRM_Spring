package org.example.crm_spring.controller;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.crm_spring.entity.Customer;
import org.example.crm_spring.entity.CustomerInfo;
import org.example.crm_spring.entity.User;
import org.example.crm_spring.repository.UserRepository;
import org.example.crm_spring.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@Controller
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserService userService;
    @GetMapping("/")
    public String login(){
        return "login";
    }

    @PostMapping("/userLogin")
    public String loginUser(@ModelAttribute User user){
       return userService.loginUser(user);
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }

    @PostMapping("/register")
    public String loadRegister(@ModelAttribute User user){
        return userService.loadRegister(user);
    }





}
