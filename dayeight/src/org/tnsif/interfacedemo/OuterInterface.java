//to demonstrate interface
//nested interface : inside an interface 
//there will be another interface
package org.tnsif.interfacedemo;

public interface OuterInterface {

	
	int sum();
	interface InnerInterface{
		String concatenate();
	
	}
}
