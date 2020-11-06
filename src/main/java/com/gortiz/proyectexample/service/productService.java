package com.gortiz.proyectexample.service;

import java.util.List;

import com.gortiz.proyectexample.entity.Product;


public interface productService {
	
    List<Product> getProduct();
	
    public Product findProduct(long id);
	
	public Product createProduct(Product p);
	
	public Product update(Product p);
	
		

}
