package org.tnsif.application;

import org.tnsif.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {

	public MMSavingAcc(int accNO, String accNm, float accBal, boolean isSalaried) {
		super(accNO, accNm, accBal, isSalaried);
	}

	@Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + "]";
	}
	
}
