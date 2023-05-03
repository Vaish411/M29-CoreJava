
// to demo on static variable
package org.tnsif.statickeyworddemo;

public class Employee {

	
	//non static private data members
	private int empid;
	private String empname;
	
	//static data members
	static String companyName= "tnsif";

	public Employee(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + "]";
	}

	
	
	
}