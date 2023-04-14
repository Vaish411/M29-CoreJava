package org.tnsif.superkeyword;

public class Animal {
	
 public String animalType="wild";
 public int noOfLegs=4;
 
 
  
 public Animal() {
	System.out.println("Animal class constructor - parent");
}
public void display() {
	 System.out.println("Animal Type :"+animalType);
	 System.out.println("No of Legs : "+noOfLegs);
	 
 }
@Override
public String toString() {
	return "Animal [animalType=" + animalType + ", noOfLegs=" + noOfLegs + "]";
}
 
}
