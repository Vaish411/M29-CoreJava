//Program to demonstrate string literal and new keyword

package org.tnsif.stringprograms;

public class StringSimpleProgram {

	public static void main(String[] args) {
		//using string literal
		String str1 = "Vaishnavi";
		System.out.println("using string literal: " +str1);
		
		//using new keyword
		String str2 = new String("Vaishnavi");
		System.out.println("using new keyword: " +str2);
		
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
	}

}