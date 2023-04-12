
// program to demo on user input value
package org.tnsif.userinput.demo;

import java.util.Scanner;

public class UserInputProgram {

	public static void main(String[] args) {
		   //user-input

	Scanner s = new Scanner(System.in);
	System.out.print("enter the salary");
	float salary = s.nextFloat();
//	double salary1 =s.nextDouble();
	
	System.out.print("enter the name");
	// next() is used to get the first word of your sentence 
	String name =s.next();
	s.nextLine();
	
	System.out.print("enter the name1");
	// nextLine() is used to get the entire sentene of your string
	String name1 =s.nextLine();
	
	System.out.print("enter the character ");
	String ch = s.nextLine();
	
	System.out.println("salary is "+ salary);
	System.out.println("name is "+ name);
	System.out.println("name is "+ name1);
	System.out.println("character is "+ ch);
    s.close();
    
	}

}