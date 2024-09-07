package com.example.mywebservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class MyController {
	
	@GetMapping
	public String test() {
		System.out.println("Test");
		return "Test";
	}

}
