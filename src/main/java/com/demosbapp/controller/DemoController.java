package com.demosbapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/test")
	public String TestMethod() {
		return "Hello_world";
	}

}
