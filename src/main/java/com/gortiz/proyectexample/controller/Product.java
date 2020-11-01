package com.gortiz.proyectexample.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gortiz.proyectexample.entity.Provider;
import com.gortiz.proyectexample.service.providerService;

@Controller
@RequestMapping("/home/")
public class Product {
	
	@Autowired
	@Qualifier("providerImpl")
	private providerService personService;
	List<Provider> people =new ArrayList<>();
	private static final Logger logger = LoggerFactory.getLogger(Product.class);
	
	@GetMapping("product")
	public String start_product() {
		return "product";
	}

}
