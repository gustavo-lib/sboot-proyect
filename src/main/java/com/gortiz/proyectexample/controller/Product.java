package com.gortiz.proyectexample.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	@Qualifier("providerImpl")
	private ProviderService providerService;
	
	@Autowired
	@Qualifier("productImpl")
	private ProductService productService;


	@GetMapping("product")
	public ModelAndView start_product() {
		logger.info("-----------------------OBTENIENDO LA LISTA DE PROVEEDORES---------------------------------------------");
		ModelAndView model=new ModelAndView("product");
	    model.addObject("list", providerService.getListProvider());
		return model;
	}

	
	@GetMapping("viewproduct/{id}")
	public String editPerson(@PathVariable("id") long id, Model model) {
		logger.info("----------------------OBTENIENDO LISTA DE PRODUCTOS POR PROVEEDOR--------------------------------------");
		model.addAttribute("list",productService.buscarproductos(id));
		return "listproduct";
	}
	
	@GetMapping("form")
	public String formProv(Model model) {
		logger.info("----------------------FORMULARIO PARA UN NUEVO PROVEEDOR------------------------------------------------   ");
		model.addAttribute("provider", new Provider());
		return "prov";
	}
	
	
	@GetMapping("showformproduct/{id}/newproduct")
	public String formShowProduct(@PathVariable("id") long id, Model model) {
		Product p= new Product();
		model.addAttribute("product", p);
		//productService.createProduct(p);
		return "redirect:product";
	}
	
	@PostMapping("saveproduct")
	public String saveproduct() {
		
		return "";
	}
	
	
	//@GetMapping("showformproduct/{id}/newproduct")
	//public String 
		
	@PostMapping("saveprov")
	public String saveProv(@ModelAttribute("provider") Provider p) {
		logger.info("---------------------------NUEVO PROVEEDOR AGREGADO----------------------------------------------------   ");
		providerService.createProvider(p);
		return "redirect:product";
	}

}
