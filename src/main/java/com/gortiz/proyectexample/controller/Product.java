package com.gortiz.proyectexample.controller;

import java.util.ArrayList;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gortiz.proyectexample.entity.Provider;
import com.gortiz.proyectexample.service.productService;
import com.gortiz.proyectexample.service.providerService;

@Controller
@RequestMapping("/home/")
public class Product {
	
	@Autowired
	@Qualifier("providerImpl")
	private providerService providerService;
	
	@Autowired
	@Qualifier("productImpl")
	private productService productService ;
	
	//List<Provider> provider =new ArrayList<>();
	private static final Logger logger = LoggerFactory.getLogger(Product.class);
	
	
	
	


	@GetMapping("product")
	public ModelAndView start_product() {
		logger.info("------------OBTENIENDO LA LISTA DE PROVEEDORES------------");
		ModelAndView model=new ModelAndView("product");
	    Provider p= new Provider("hhh","jjj", "fff");
	    providerService.createProvider(p);
	    
	    model.addAttribute("list",providerService.getProvider());
		return model;
		//return "product";
	}

	
	@GetMapping("edit2/{id}")
	public String editPerson(@PathVariable("id") long id, Model model) {
		//Person personFind= personSe.findPerson(id);//this.people.get(id);
		//Provider p =provider.getClass()
		//model.addAttribute("person",personFind);
		//logger.info("OBJECT TO EDIT   "+ personFind.toString());
		return "edit";
	}

	/*
	 * 	//model.addObject("list", providerService.getProvider());
		//Provider p =new Provider("Ana", "Prueba", "Sarmiento 2222",lista_producto);
	//	ser
		
		Set<Product > lista_producto = new HashSet<Product>(); 
		Product prod=new  Product("dsa",25.1); 
		//productService.createProduct(prod);
		lista_producto.add(prod);
		Provider proveedor =new Provider("nombre_proveedor","apellido_proveedor","direccion_proveedor");
		Provider proveedor2 =new Provider("nombre_proveedor2","apellido_proveedor2","direccion_proveedor2");
		providerService.createProvider(proveedor);
		providerService.createProvider(proveedor2);
		
		Set<Provider> lista_producto2 = new HashSet<Prodiver>(); 
		//p.setProduct(lista_producto);
		//p.setProduct(lista_producto);
		
		
		
		
		
		//p.setProduct(lista_producto);
		
		model.addObject("list", providerService.getProvider());*/
	
}
