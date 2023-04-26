package org.tnsif.assignmentFunctionRecursion;

import java.util.Scanner;
//func definition
public class FactorialUsingFunction {
	static int factorial(int num) 
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact = fact*i;
		}
		return fact;
	}
public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   System.out.println("Enter the number8 :");
   int num = s.nextInt();
//func call
   System.out.println("Factorial of a number:"+factorial(num));
   s.close();
}
}
