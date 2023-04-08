

//Program to demo on naes
package org.tnsif.looping;

public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j;
	    int rows=4;
	    int colomn =4;
	    for (i = 1; i <=rows;i++ ) {
	      for (j = 1; j <=colomn; j++) {
	        System.out.print("*");
	      }
	      System.out.println("");
	    }

	}
}