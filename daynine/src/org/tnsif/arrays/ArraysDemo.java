//program to demo on simple array program
package org.tnsif.arrays;

public class ArraysDemo {

	public static void main(String[] args) {

		//compile time array initialise
		int arr[]= {12,6,19,67};
		
		/* if we acces fourth index we will get an exception as "Array index out of 
		 * bound exception"
		 * as accesing 4th index that is not present*/
		//System.out.println(arr[4]);
		
		System.out.println(arr[2]);
		
		//for printing all array elements
		for(int i:arr) {
			System.out.println(i+" ");
			
			
		}
	}

}