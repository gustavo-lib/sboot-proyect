package com.gortiz.proyectexample.service;

import java.util.List;

import com.gortiz.proyectexample.entity.Provider;

public interface ProviderService {

	
public Provider findProvider(long id);
	
	public List<Provider> getListProvider();
	
	public Provider createProvider(Provider p);
	
	public Provider update(Provider p);
	
	public void delete(long id);
}
