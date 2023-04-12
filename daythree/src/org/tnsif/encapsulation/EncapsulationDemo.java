package org.tnsif.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		//object creation
		HDFCbank h = new HDFCbank();
		
		//setters is used to set a value
		h.setCardNo(454645645L);
		h.setCardType("Debit");
		h.setCvvNo(444);
		h.setPinNo(1111);
		//getters is used to return a value
		
		System.out.println(h.getCardNo());
		System.out.println(h.getCardType());
		System.out.println(h.getCvvNo());
		System.out.println(h.getPinNo());
	}

} 	