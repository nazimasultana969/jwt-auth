package com.example.jwtauth.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	/*
	 * @GetMapping("/api/user/profile") public String profile(Authentication
	 * authentication) {
	 * 
	 * return "Welcome " + authentication.getName();
	 * 
	 * }
	 */
	 @GetMapping("/api/user/profile")
	public Object profile(Authentication authentication) {

	    return authentication.getAuthorities();

	}

}