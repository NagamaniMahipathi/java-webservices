package com.example.mywebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages="com.example.mywebservice")
public class WebServiceTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebServiceTestApplication.class, args);
	}

}
