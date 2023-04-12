package org.tnsif.encapsulation;

public class HDFCbank {
	
	//private members
	private Long CardNo;
	private String cardType;
	private int cvvNo;
	private int pinNo;
	
	public Long getCardNo() {
		return CardNo;
	}
	public void setCardNo(Long cardNo) {
		this.CardNo = cardNo;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public int getCvvNo() {
		return cvvNo;
	}
	public void setCvvNo(int cvvNo) {
		this.cvvNo = cvvNo;
	}
	public int getPinNo() {
		return pinNo;
	}
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
	
	@Override
	public String toString() {
		return "HDFCbank [CardNo=" + CardNo + ", cardType=" + cardType + ", cvvNo=" + cvvNo + ", pinNo=" + pinNo + "]";
	}
	
	
	
	
	
	
}