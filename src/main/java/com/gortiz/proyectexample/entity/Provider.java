package com.gortiz.proyectexample.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;

@Entity
public class Provider {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

    private String firstname;
    private String lastname;
    private String address;
   
    @OneToMany(mappedBy = "provider", fetch = FetchType.LAZY,
    cascade = CascadeType.ALL)
    private Set<Product> product;
    
    
    
	
	public Set<Product> getProduct() {
		return product;
	}
	public void setProduct(Set<Product> product) {
		this.product = product;
	}
	
	public void addProduct(Product p) {
		product.add(p);
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Provider() {
		product=new HashSet<Product>();
		
	}
	public Provider(String firstname, String lastname, String address) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		product=new HashSet<Product>();
	}
	
	
    
}
