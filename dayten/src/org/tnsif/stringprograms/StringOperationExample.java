//Program to demonstrate on string built-in function
package org.tnsif.stringprograms;

public class StringOperationExample {

	public static void main(String[] args) {
		//using new keyword
		String str1 = new String("Vaish");
		String str2 = new String("Pattu");
		System.out.println(str1.toUpperCase());
		System.out.println(str2.toLowerCase());
		System.out.println(str1.length());
		System.out.println(str1.lastIndexOf('t'));
		System.out.println(str1.hashCode());
		System.out.println(str1.concat(str2));
	}

}