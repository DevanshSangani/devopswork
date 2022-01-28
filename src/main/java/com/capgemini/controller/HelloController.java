package com.capgemini.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
	public String hello() {
    	System.out.println("Hello I am controller");
		return "Hello I am controller 12345S";
	}
}
