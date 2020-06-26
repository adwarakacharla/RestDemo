package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestDemoController {

	@GetMapping("/hello")
	public String getString() {
		return "Hello World!!!!!";
	}
}
