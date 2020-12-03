package com.gortiz.proyectexample.service.serviceImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.gortiz.proyectexample.entity.Product;
import com.gortiz.proyectexample.repository.ProductRepository;
import com.gortiz.proyectexample.service.ProductService;

@Service("productImpl")
public class ServiceProductImpl  implements ProductService{

	@Autowired
	@Qualifier("productRepository")
	ProductRepository productRepository;
	
	@Override
	public Product findProduct(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getListProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product createProduct(Product p) {
		// TODO Auto-generated method stub
		productRepository.save(p);
		return null;
	}

	@Override
	public Product update(Product p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public List<Product> buscarproductos(Long id) {
		// TODO Auto-generated method stub
		List <Product> p= new ArrayList<Product>();
		p=productRepository.findByProductos(id);
		System.out.println("LAS COSAS D ELA VIDA LLLLLLLLL     -*-** " +p.size());
		return  p;
		//return productRepository.findByProductos(id);
		
	}

}
