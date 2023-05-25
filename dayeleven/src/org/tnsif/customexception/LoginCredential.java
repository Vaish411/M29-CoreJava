//Program to demonstrate on user-defined exception
package org.tnsif.customexception;

//to create a custom exception we need to extend an Exception class
public class LoginCredential extends Exception {

	private String str1;

	// parameterized constructor
	public LoginCredential(String str1) {
		super();
		this.str1 = str1;
	}

	@Override
	public String toString() {
		return "LoginCredential [str1=" + str1 + "]";
	}

}