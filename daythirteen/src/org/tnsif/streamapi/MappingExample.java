//Program to demonstrate on mapping
package org.tnsif.streamapi;

import java.util.Arrays;
import java.util.List;

public class MappingExample {

	public static void main(String[] args) {
		List<String> obj = Arrays.asList("Vaish", "Pattuu", "Pala");
		obj.stream().map(i -> i.length()).forEach((i) -> System.out.print(i + " "));
	}

}