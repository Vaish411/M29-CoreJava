//Program to demonstrate on packages and access specifier

package org.tnsif.firstpackage;

public class Base {

	/*
	 * Declaring all the access specifiers with variables
	 */
	int varDefault = 10;
	public String varPublic = "John";
	private int varPrivate = 1221;
	protected float varProtected = 1234.50f;

	// Declaring all the access specifier using method
	void methodDefault() {
		System.out.println("Default access method: " + varDefault);
	}

	public void methodPublic() {
		System.out.println("Public access method: " + varPublic);
	}

	private void methodPrivate() {
		System.out.println("Private access method: " + varPrivate);
	}

	protected void methodProtected() {
		System.out.println("Protected access method: " + varProtected);
	}
}