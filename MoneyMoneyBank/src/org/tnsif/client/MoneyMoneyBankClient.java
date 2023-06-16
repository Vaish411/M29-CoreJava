package org.tnsif.client;

import org.tnsif.application.MMBankFactory;
import org.tnsif.application.MMCurrentAcc;
import org.tnsif.application.MMSavingAcc;
import org.tnsif.framework.BankFactory;
import org.tnsif.framework.CurrentAcc;
import org.tnsif.framework.SavingAcc;

//driver class

public class MoneyMoneyBankClient {

	public static void main(String[] args) {
      BankFactory b=new MMBankFactory();
      SavingAcc s=new MMSavingAcc(1234, "Vaishnavi Patel", 9000, true);
      CurrentAcc c=new MMCurrentAcc(9876, "Vaishnavi Patel", 5000, 500);
      System.out.println("saving account");
      s.withdraw(1000);
      System.out.println("current account");
      c.withdraw(1000);
	}

}
