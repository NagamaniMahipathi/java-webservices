package com.example.mywebservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DefaultController {
	
	@GetMapping
	public String test() {
		System.out.println("Welcome to default home page");
		return "Welcome to default home page";
	}

}
