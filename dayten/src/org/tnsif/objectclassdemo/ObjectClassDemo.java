//Program to demonstrate on object class
package org.tnsif.objectclassdemo;

class Sample {

}

class Demo {

	// constructor
	Demo() {
		// resource allocator
		System.out.println("Inside Constructor");
	}

	protected void finalize() {
		System.out.println("Inside finalize method");
	}

}

public class ObjectClassDemo {

	public static void main(String[] args) {

		Sample s = new Sample();
		System.out.println(s.getClass());
		System.out.println(s.hashCode());

		Demo s1 = new Demo();
		System.out.println(s1.getClass());
		System.out.println(s1.hashCode());

		/*
		 * object class is used when you want to refer the datatype of the object class
		 * you want to know
		 */
		Object obj = new Object();
		System.out.println(obj.getClass());
		
	}

}