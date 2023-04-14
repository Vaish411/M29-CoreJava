package org.tnsif.superkeyword;

public class Tiger extends Animal{
	public String animalType;
	 public int noOfLegs;
	 
	 
	  //default constructor
	 public Tiger() {
		 //invoking the parent class constructor
		 //it calls parent class default constructor
		 super();
		System.out.println("Tiger class constructor - child");
	}

	public void display() {
		 //super keyword with method
		 super.display();
		 //super keyword with variables
		 System.out.println(super.animalType);
		 System.out.println(super.noOfLegs);
		 System.out.println("Animal Type :"+animalType);
		 System.out.println("No of Legs : "+noOfLegs);
		 
	 }

	@Override
	public String toString() {
		return "Tiger [animalType=" + animalType + ", noOfLegs=" + noOfLegs + "]";
	}


}
