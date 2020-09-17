package com.gortiz.proyectexample.model;

import java.util.Date;

public class Person {
	String firstname;
	String lastname;
	Date date;
	String country;
	
	
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Person(String firstname, String lastname, Date date, String country) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.date = date;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", date=" + date + ", country=" + country
				+ "]";
	}
	
	

}
