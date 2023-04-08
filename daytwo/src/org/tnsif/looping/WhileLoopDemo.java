package org.tnsif.looping;

import java.util.Scanner;

public class WhileLoopDemo {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the number");
		int N =  s.nextInt();
		
		int i =1;
		while(i<=N)
		{
		System.out.print(i + " ");	
		i++;
		}
	}

}