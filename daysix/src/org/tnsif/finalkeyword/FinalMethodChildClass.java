package org.tnsif.finalkeyword;

public class FinalMethodChildClass extends FinalMethod{
	
	final int num=275;
	
	final void show(int num) {
		System.out.println("The number is : "+num);
	}
	//final method cant be overridden,it gives compile time error

}
