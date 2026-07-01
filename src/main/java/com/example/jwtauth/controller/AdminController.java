package com.example.jwtauth.controller;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.Authentication;

import com.example.jwtauth.entity.User;
import com.example.jwtauth.repository.UserRepository;
@RestController
public class AdminController {

    private final UserRepository repository;

    public AdminController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/api/admin/users")
    @PreAuthorize("hasRole('ADMIN')")
    public List<User> getUsers() {
        return repository.findAll();
    }
}