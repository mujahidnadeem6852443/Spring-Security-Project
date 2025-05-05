package com.security_project.securityproject.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello(HttpServletRequest request) {
        return "Hello World\n" + request.getSession().getId();
    }

}
