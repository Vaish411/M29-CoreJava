package org.tnsif.singleinheritance;
//Every inheritance is IS -A relationship

//child class

public class Student extends Citizen {
	// private data members

	private String college;
	private int rollno;

	// default constructor
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String aadharNo, String city, long contactNo, String college, int rollno) {
		super(name, aadharNo, city, contactNo);
		this.college = college;
		this.rollno = rollno;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return "Student [college=" + college + ", rollno=" + rollno + ", getName()=" + getName() + ", getaadharNo()="
				+ getaadharNo() + ", getCity()=" + getCity() + ", getContactNo()=" + getContactNo() + "]";
	}

	

	

}