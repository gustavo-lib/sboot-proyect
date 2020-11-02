package com.gortiz.proyectexample.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.gortiz.proyectexample.entity.Provider;
import com.gortiz.proyectexample.service.providerService;

@Controller
@RequestMapping("/home/")
public class Product {
	
	@Autowired
	@Qualifier("providerImpl")
	private providerService providerService;
	
	List<Provider> provider =new ArrayList<>();
	private static final Logger logger = LoggerFactory.getLogger(Product.class);
	
	
	
	@GetMapping("product")
	public ModelAndView start_product() {
		logger.info("------------OBTENIENDO LA LISTA DE PROVEEDORES------------");
		ModelAndView model=new ModelAndView("product");
		//model.addObject("list", providerService.getProvider());
		Provider p =new Provider("Ana", "Prueba", "Sarmiento 2222");
		provider.add(p);
		model.addObject("list", provider);
		return model;
		//return "product";
	}


	
	
}
