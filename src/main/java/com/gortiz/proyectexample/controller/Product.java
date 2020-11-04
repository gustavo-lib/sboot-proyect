package com.gortiz.proyectexample.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

import com.gortiz.proyectexample.entity.Product;
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
	
	
	
	public Product(String string, double d) {
		// TODO Auto-generated constructor stub
	}


	@GetMapping("product")
	public ModelAndView start_product() {
		logger.info("------------OBTENIENDO LA LISTA DE PROVEEDORES------------");
		ModelAndView model=new ModelAndView("product");
		//model.addObject("list", providerService.getProvider());
		Provider p =new Provider("Ana", "Prueba", "Sarmiento 2222");
		
		Set<Product> lista_producto = new HashSet<Product>(); 
		Product prod=new  Product("dsa",25.1); 
		lista_producto.add(prod);
		p.setProduct(lista_producto);
		provider.add(p);
		model.addObject("list", provider);
		return model;
		//return "product";
	}

	
	@GetMapping("edit/{id}")
	public String editPerson(@PathVariable("id") long id, Model model) {
		//Person personFind= personSe.findPerson(id);//this.people.get(id);
		//Provider p =provider.getClass()
		//model.addAttribute("person",personFind);
		//logger.info("OBJECT TO EDIT   "+ personFind.toString());
		return "edit";
	}

	
	
}
