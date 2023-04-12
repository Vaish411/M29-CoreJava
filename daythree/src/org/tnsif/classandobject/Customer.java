//Program to demonstrate class, object and constructor

package org.tnsif.classandobject;

public class Customer {
	// private variables
	private int cust_Id;
	private String cust_Name;
	private String city;

	/*
	 * A constructor does not have any return type it is same as class name followed
	 * by ()
	 */

	// This is default constructor
	public Customer() {
		super();

	}

	// This is a parameterized constructor
	public Customer(int cust_Id, String cust_Name, String city) {
		super();
		this.cust_Id = cust_Id;
		this.cust_Name = cust_Name;
		this.city = city;
	}

	/*
	 * to access all the private data members into another class use getters and
	 * setters
	 */
	// setters and getters
	public int getCust_Id() {
		return cust_Id;
	}

	public void setCust_Id(int cust_Id) {
		this.cust_Id = cust_Id;
	}

	public String getCust_Name() {
		return cust_Name;
	}

	public void setCust_Name(String cust_Name) {
		this.cust_Name = cust_Name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Customer [cust_Id=" + cust_Id + ", cust_Name=" + cust_Name + ", city=" + city + "]";
	}

}