package org.tnsif.stringprograms;

import java.util.Scanner;

public class StringMethodProgram {

	public static void main(String[] args) {
		String str1 = "Vaish";
		Scanner s = new Scanner(System.in);
		String str2 = new String(s.nextLine());
		if(str1.equals(str2)) {
			System.out.println("Matching");
		}
		else {
			System.out.println("Not Matching");
		}

	}

}