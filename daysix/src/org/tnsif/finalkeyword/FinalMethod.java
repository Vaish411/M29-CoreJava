//to demonstrate on final method
//parent class
package org.tnsif.finalkeyword;

public class FinalMethod {
	//default constructor
	public FinalMethod() {
		System.out.println("default constructor");
	}
	//final variable
	final float salary = 27000.89f;
	//final method
	final void show()
	{
		System.out.println("Salary is : "+salary);
	}

}
