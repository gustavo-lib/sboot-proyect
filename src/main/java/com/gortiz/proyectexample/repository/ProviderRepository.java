package com.gortiz.proyectexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gortiz.proyectexample.entity.Provider;

@Repository("respositoryProvider")
public interface ProviderRepository extends JpaRepository<Provider, Long>{
	
	@Query("select * from provider where provider.id=?1 ")
	public Provider fecthfetchByIdWithProduct(Long id);

}
