
//program to demo on this keyword
package org.tnsif.thiskeyworddemo;
public class ThisExecutorExample {
	private int cvvNo;
	private long atmNo;
	//parameterised constructor
	public ThisExecutorExample(int cvvNo, long atmNo) {
		super();
		this.cvvNo = cvvNo;
    	this.atmNo = atmNo;
		
//		cvvNo = cvvNo;
//		atmNo = atmNo;
	}
	public void print()
	{
		System.out.println("CVV no is :"+ cvvNo + " "+ "ATM Card "+atmNo);
	}	
}