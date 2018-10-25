package com.example.crud.model;

public class User {

	private int customerid;
	private String Name;
	private String DOJ;
	private String City;
	private String Contact;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int customerid, String Name, String DOJ, String City, String Contact) {
		super();
		this.customerid = customerid;
		this.Name = Name;
		this.DOJ = DOJ;
		this.City = City;
		this.Contact = Contact;

	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDOJ() {
		return DOJ;
	}
	public void setDOJ(String dOJ) {
		DOJ = dOJ;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getContact() {
		return Contact;
	}
	public void setContact(String contact) {
		Contact = contact;
	}
}