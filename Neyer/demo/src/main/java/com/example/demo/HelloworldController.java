package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller    //sa indique que c'est une servellte  
public class HelloworldController {
	
		
		@RequestMapping("/test")//on met entre (), le nom de la servelette
		@ResponseBody
		public String hello() {
		return  "tourne";
				
	}
}
