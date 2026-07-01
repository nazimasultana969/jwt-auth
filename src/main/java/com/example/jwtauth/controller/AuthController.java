package com.example.jwtauth.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.example.jwtauth.dto.RegisterRequest;
import com.example.jwtauth.service.AuthService;
import com.example.jwtauth.dto.LoginRequest;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public String register(@Validated @RequestBody RegisterRequest request) {

        return authService.register(request);

    }
    
    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {

        return authService.login(request);

    }

}