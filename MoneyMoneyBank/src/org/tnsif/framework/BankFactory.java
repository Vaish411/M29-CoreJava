package org.tnsif.framework;

public abstract class BankFactory {
	
	abstract public SavingAcc getNewSavingAcc(int accNO, String accNm, float accBal, boolean isSalaried);
	abstract public CurrentAcc getNewCurrentAcc(int accNO, String accNm, float accBal, float creditLimit);

}
