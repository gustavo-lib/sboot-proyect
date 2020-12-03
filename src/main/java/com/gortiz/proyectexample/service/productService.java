package com.gortiz.proyectexample.service;

import java.util.List;

import com.gortiz.proyectexample.entity.Product;

public interface ProductService {

    public Product findProduct(Long id);
	
	public List<Product> getListProduct();
	
	public Product createProduct(Product p);
	
	public Product update(Product p);
	
	public void delete(Long id);
	
	public List<Product> buscarproductos(Long id);
}
