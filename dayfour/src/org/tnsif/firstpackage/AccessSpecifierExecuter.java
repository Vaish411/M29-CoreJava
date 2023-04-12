//Driver Class
//Program to demonstrate on packages, access specifiers and instanceOf

package org.tnsif.firstpackage;

public class AccessSpecifierExecuter {

	public static void main(String[] args) {
		Base b = new Base();
		b.methodDefault();
		b.methodPublic();
		b.methodProtected();
		
		//InstanceOf operator
		System.out.println(b instanceof Base);
	}

}