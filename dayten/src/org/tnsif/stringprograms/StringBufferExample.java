//Program to demonstrate in string buffer
package org.tnsif.stringprograms;

public class StringBufferExample {

	public static void main(String[] args) {
		//by default capacity of empty string is 16
		StringBuffer str1 = new StringBuffer("Vaishnavi");
		System.out.println(str1.capacity());
		System.out.println(str1.charAt(5));

	}

}