package com.mytest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class helloSpring {
	
	@RequestMapping("/hello")
	@ResponseBody
	
	public String hello() {
		
		return "bonjour neyer !!";
	}

}
