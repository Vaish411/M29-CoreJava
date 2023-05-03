package org.tnsif.interfacedemo;

public class ATMMachineChild implements ATMMachine {
	
	public void withdraw() {
		System.out.println("Amount Withdraw");
	}
	public void deposit() {
		System.out.println("Amount Deposit");
	}

}
