//Program to demonstrate on reducing
package org.tnsif.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceOperation {

	public static void main(String[] args) {
		List<Integer>obj=Arrays.asList(23,45,67,88);
		Optional<Integer>obj1=obj.stream().reduce((a,b)->(a*b));
		if(obj1.isPresent()) {
			System.out.println(obj1.get());
		}

	}

}