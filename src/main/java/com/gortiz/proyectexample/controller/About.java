package com.gortiz.proyectexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/about/")
public class About {
	
	@GetMapping("home")
	public String star() {
		return "about";
	}

}
