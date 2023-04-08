package org.tnsif.decisionmaking;

import java.util.Scanner;

public class CascadedIfElse {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter the percentage value");
	float percentage1 = s.nextFloat();
	float percentage2 = s.nextFloat();
	float percentage3 = s.nextFloat();
	if(percentage1>percentage3 && percentage1>percentage2)	
	{
		System.out.println("Person1 has high percentage");
	}
	else if(percentage2>percentage3&&  percentage2>percentage1)
	{
		System.out.println("Person3 has high percentage");
	}
	else 
	{
		System.out.println("Person3 has high percentage");
	}
	}

}