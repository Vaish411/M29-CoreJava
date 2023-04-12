package org.tnsif.secondpackage;

import org.tnsif.firstpackage.Base;

public class Executor {

	public static void main(String[] args) {
		Base b1 = new Base();
		/*If any method is default 
		 * we cannot access it into another class
		 */
		//b1.methodDefault() //cannot be accessed in another package
		b1.methodPublic();
		
	}

}