package com.gortiz.proyectexample.service.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.gortiz.proyectexample.entity.Product;
import com.gortiz.proyectexample.repository.ProductRepository;
import com.gortiz.proyectexample.service.productService;

@Service("productImpl")
public class ServiceProductImpl implements productService{

	@Autowired
	@Qualifier("repositoryProduct")
	ProductRepository productRepository;
	@Override
	public List<Product> getProduct() {
		// TODO Auto-generated method stub
		productRepository.findAll();
		return null;
	}

	@Override
	public Product findProduct(long id) {
		// TODO Auto-generated method stub
		//return <optional> productRepository.findById(id);
		
		return null;
	}

	@Override
	public Product createProduct(Product p) {
		// TODO Auto-generated method stub
		return productRepository.save(p);
		//return null;
	}

	@Override
	public Product update(Product p) {
		// TODO Auto-generated method stub
		return productRepository.save(p);
		//return null;
	}

}
