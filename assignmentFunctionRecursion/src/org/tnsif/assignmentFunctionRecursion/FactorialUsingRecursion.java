package org.tnsif.assignmentFunctionRecursion;

import java.util.Scanner;

public class FactorialUsingRecursion {
	
	//function definition
	static int factorial(int num) 
	{
		if(num!=0)
			return num*factorial(num-1);
		return 1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner s = new Scanner(System.in);
		   System.out.println("Enter the number :");
		   int num = s.nextInt();
		//func call
		   System.out.println("Factorial of a number:"+factorial(num));
		   s.close();

	}

}
