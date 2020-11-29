package com.gortiz.proyectexample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.gortiz.proyectexample.entity.Product;
import com.gortiz.proyectexample.entity.Provider;

@Repository("providerRepository")
public interface ProviderRepository extends JpaRepositoryImplementation<Provider, Long> {
	
	//@Query("select * from product, provider where provider.id=product.fk_provider and product.fk_provider=?1")
	//@Query("select * from  provider where provider.id=?1")
	//public List<Provider> fetchByIdWithProviderWhithIdProducto(Long id);

}
