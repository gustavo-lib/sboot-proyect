package com.gortiz.proyectexample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.gortiz.proyectexample.entity.Product;

@Repository("productRepository")
public interface ProductRepository extends JpaRepositoryImplementation<Product, Long> {
	
	
	//@Query("SELECT u FROM Product u WHERE u.id = ?1") prodiver.Id=product.provider_fk and
	@Query(value="select * from product where "
			+ " product.provider_fk =? " , nativeQuery=true )
	public List<Product> findByProductos(Long id);
	
	//public findById
	

}
