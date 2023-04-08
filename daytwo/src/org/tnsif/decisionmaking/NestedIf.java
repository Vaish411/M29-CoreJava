
// prgram to demonstrate the nestedif
package org.tnsif.decisionmaking;

import java.util.Scanner;

public class NestedIf{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENter the number ");
		int num = s.nextInt();
		s.close();
		if(num>0)
		{
			//nested if
			if(num<0)
			{
				System.out.println("Non - zero number");
			}
			else
			{
				System.out.println("zero/non- number");
			}
		}
		else
		{
			System.out.println("either zero or non zero");
			
		}
	}

}