package com.person;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class myController {

	@RequestMapping("/")
	public String welcom() {
		return "index";
	}
}
