// program to demo on class object and constructor

//Program to demonstrate on class , object and constructor
//driver class
package org.tnsif.classandobject;

import java.util.Scanner;

public class ConstructorDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the customer id: ");
		int id = s.nextInt();

		// To read the next line
		s.nextLine();
		System.out.println("Enter the customer name: ");
		String name = s.nextLine();
		System.out.println("Enter the city: ");
		String city = s.nextLine();
		s.close();

		// Object creation
		Customer c = new Customer();
		c.setCust_Id(id);
		c.setCust_Name(name);
		c.setCity(city);

		// Below statement will call to string method
		System.out.println(c);

		
		// Parameterized constructor is invoked
		Customer c1 = new Customer(id, name, city);
		System.out.println(c1);
	}

}