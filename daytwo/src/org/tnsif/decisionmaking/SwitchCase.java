

// program to demonstrate the switch
package org.tnsif.decisionmaking;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		System.out.println(" Enter the song input");
		int songinput = s.nextInt();
		switch (songinput) 
		{
		case 1:
			System.out.println("calm down");
			break;
		case 2:
			System.out.println("perfect");
			break;
		case 3:
			System.out.println("Mallemsong");
			break;
			
			default:
				System.out.println("Invalid Input");
		}
		
		
	}

}