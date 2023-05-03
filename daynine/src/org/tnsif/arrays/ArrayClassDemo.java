//program to demo on arrays class
package org.tnsif.arrays;

import java.util.Arrays;

public class ArrayClassDemo {

	public static void main(String[] args) {
//array initialization
		int array[]= {12,13,14,12};
		//using array class we print all the elements
		System.out.println(Arrays.toString(array));
		//sorting the array
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
	}

}