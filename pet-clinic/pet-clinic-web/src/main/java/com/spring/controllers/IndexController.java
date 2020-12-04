package com.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping({"", "/", "index", "index.html"})
	public String index() {
		
		// Thymeleaf will look for view in templates folder called index.html
		return "index";
	}
}
