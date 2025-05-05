package com.security_project.securityproject.controller;

import com.security_project.securityproject.model.User;
import com.security_project.securityproject.service.UserService;
import jakarta.servlet.ServletConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;
    @Autowired
    private ServletConfig servletConfig;


    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return service.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        return service.verify(user);

    }











}
