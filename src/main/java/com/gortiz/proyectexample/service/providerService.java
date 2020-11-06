package com.gortiz.proyectexample.service;

import java.util.List;

import com.gortiz.proyectexample.entity.Product;
import com.gortiz.proyectexample.entity.Provider;

public interface providerService {

	List<Provider> getProvider();
	
    public Provider findProvider(long id);
	
	public Provider createProvider(Provider p);
	
	public Provider update(Provider p);
	
	public void delete(long id);
	
	public void saveProducto(Product p);
}
