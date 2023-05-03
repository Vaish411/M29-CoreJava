package org.tnsif.statickeyworddemo;

public class StaticKeywordExecutor {

	public static void main(String[] args) {
		System.out.println(Employee.companyName);
		Employee e =new Employee(1,"abhinav rawat");
		System.out.println(e);
		
		Employee e1 =new Employee(2,"parag");
		System.out.println(e1);
		
		Customer.display();
		Customer c = new Customer();
		System.out.println();
	}

}