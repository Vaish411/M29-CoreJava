// program to demo on multidimensional array
package org.tnsif.arrays;

import java.util.Scanner;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		
		
		int arr[][] =new int[2][3];//{{},{}}
		for (int i=0;i<2;i++)
		{
			for(int j=0;j<3;i++)
			{
				arr[i][j]=s.nextInt();
			}
			
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(arr[i] [j]+" ");
			}
			System.out.println();
		}
		
		
	}

}