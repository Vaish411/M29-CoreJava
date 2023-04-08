//programto demonstrate various data types
package org.tnsif.introduction;

public class DataTypesDemo {

	public static void main(String[] args) {
		
		// integer gives value in whole number 
		// float and double gives value in decimal point
		/*if we use in programming division
		 *'/' it prints quotient value and modulo will
		 * print remainder value '%
		 */
		int num1 = 5/2;
		float num2 = 103/45;
		double num3=10/3d;
		/*if we used d after any number for double type it will give
		the precision upto 16 decimal places
		*/
		float num4=14f/3f;
		/*if we used f after any number for float type it will give
		the precision upto 7 decimal places
		*/
		System.out.println("the value is " + num1);
		System.out.println("the value is " + num2);
		System.out.println("the value is " + num3);
		System.out.println("the value is " + num4);
	}

}