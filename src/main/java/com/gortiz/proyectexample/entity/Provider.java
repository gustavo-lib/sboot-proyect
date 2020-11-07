package com.gortiz.proyectexample.entity;

import java.io.Serializable;
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
public class Provider implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

    private String firstname;
    private String lastname;
    private String address;
   
    @OneToMany(mappedBy = "provider", fetch = FetchType.LAZY,orphanRemoval = true,
    cascade = CascadeType.ALL)
    private Set<Product> productos;
    
    //@OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	//private List<Factura> facturas;
    
	
	public Set<Product> getProduct() {
		return productos;
	}
	public void setProduct(Set<Product> product) {
		this.productos = product;
	}
	
	public void addProduct(Product p) {
		productos.add(p);
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	/*public Provider(String string, String string2, String string3, Set<com.gortiz.proyectexample.controller.Product> lista_producto) {
		product=new HashSet<Product>();
		
	}*/
	public Provider(String firstname, String lastname, String address) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		productos=new HashSet<Product>();
	}
	
	
	public Provider(String firstname, String lastname, String address, Set<Product> product) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.productos = product;
	}
	
	public Provider() {
		productos= new  HashSet<Product>();
		
	}
	@Override
	public String toString() {
		return "Provider [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", address=" + address
				+ ", product=" + productos + "]";
	}
	
	
    
}
