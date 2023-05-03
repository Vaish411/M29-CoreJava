package org.tnsif.arrays;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {

		System.out.println(" Enter the no of elements :");
		Scanner s =new Scanner(System.in);
		int num=nextInt();
		
		//array declaraion 
		int arr[]=new int[num];
		//array initialization 
		for(int i=0;i<num;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int itr:arr) {
			System.out.println("array elements are :" +itr+" ");
		}
		
	}

	private static int nextInt() {
		// TODO Auto-generated method stub
		return 0;
	}

}