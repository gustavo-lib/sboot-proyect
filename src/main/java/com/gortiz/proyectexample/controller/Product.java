package com.gortiz.proyectexample.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gortiz.proyectexample.entity.Person;
import com.gortiz.proyectexample.entity.Provider;
import com.gortiz.proyectexample.service.ProductService;
import com.gortiz.proyectexample.service.ProviderService;



@Controller
@RequestMapping("/home/")
public class Product {
	
	
	
	//List<Provider> provider =new ArrayList<>();
	private static final Logger logger = LoggerFactory.getLogger(Product.class);
	
	@Autowired
	@Qualifier("serviceProviderImpl")
	private ProviderService providerService;
	
	@Autowired
	@Qualifier("serviceProductImp")
	private ProductService productService;


	@GetMapping("product")
	public ModelAndView start_product() {
		logger.info("-----------------------OBTENIENDO LA LISTA DE PROVEEDORES---------------------------------------------");
		ModelAndView model=new ModelAndView("product");
	    model.addObject("list", providerService.getListProvider());
		return model;
	}

	
	@GetMapping("edit2/{id}")
	public String editPerson(@PathVariable("id") long id, Model model) {
		logger.info("----------------------OBTENIENDO LISTA DE PRODUCTOS POR PROVEEDOR------------------------------------------------   ");
		model.addAttribute("list",productService.buscarproductos(id));
		return "edit";
	}
	
	@GetMapping("form")
	public String formProv(Model model) {
		model.addAttribute("provider", new Provider());
		return "prov";
	}
	
	@PostMapping("saveProv")
	public String saveProv() {
		return "a";
	}

}
