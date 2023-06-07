//Program to demonstrate generic example
package org.tnsif.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsAdvantageExample {

	public static void main(String[] args) {
		// type-safety
		List<Integer> list = new ArrayList<>();
		list.add(06);
		list.add(31);
		/*
		 * list.add("Vaish"); list.add(23.5);
		 */
		System.out.println(list);

		// 2. Before Generics, Typecasting is not allowed
		ArrayList<String> arr1 = new ArrayList<>();
		arr1.add("St. John");
		System.out.println(arr1);
		String str = (String) arr1.get(0);
		System.out.println(str);

		// 3. In Generics, tycasting is allowed
		ArrayList<String> arr2 = new ArrayList<>();
		arr2.add("St. John");
		System.out.println(arr2);
		String str1 = (String) arr2.get(0);
		System.out.println(str1);

	}

}