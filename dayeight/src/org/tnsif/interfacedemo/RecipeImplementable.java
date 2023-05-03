//program to implement functional interface
package org.tnsif.interfacedemo;

public class RecipeImplementable implements Recipe {
	private String name ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String displayName() {
		return "Welcome to"+name;
		
	}
	

}
