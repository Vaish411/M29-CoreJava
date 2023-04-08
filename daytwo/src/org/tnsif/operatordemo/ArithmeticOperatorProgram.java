//program to demo on Arithmatic operator

//(+,-,*,%)

package org.tnsif.operatordemo;

import java.util.Scanner;

public class ArithmeticOperatorProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the two number");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("the addition of two number is " +(x+y));

		System.out.println("the subtraction of two number is " +(x-y));

		System.out.println("the multipliction of two number is " +(x*y));
		
		System.out.println("the division of two number is " +(x/y));
		
		System.out.println("the modulo of two number is " +(x%y));
		
		sc.close();
	}

}