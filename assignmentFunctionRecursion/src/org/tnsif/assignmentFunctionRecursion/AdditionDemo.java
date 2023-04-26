package org.tnsif.assignmentFunctionRecursion;

import java.util.Scanner;

public class AdditionDemo {
	static int addition(int x,int y) {
		int sum=x+y;
		return sum;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of x and y :");
		int x=s.nextInt();
		int y=s.nextInt();
		System.out.println(addition(x,y));
	    s.close();
		}
		
	}
