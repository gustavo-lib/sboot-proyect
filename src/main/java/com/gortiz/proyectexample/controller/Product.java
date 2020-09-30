package com.gortiz.proyectexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home/")
public class Product {
	
	@GetMapping("product")
	public String start_product() {
		return "product";
	}

}
