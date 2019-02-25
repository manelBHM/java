package com.example.demo;

import org.springframework.stereotype.Controller;

@Controller
public class HelloworldController {
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello World";
	}
}
