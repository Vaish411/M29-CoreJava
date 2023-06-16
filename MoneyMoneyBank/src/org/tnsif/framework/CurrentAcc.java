package org.tnsif.framework;

public abstract class CurrentAcc extends BankAcc {
	
	private final float creditLimit;

	public CurrentAcc(int accNO, String accNm, float accBal, float creditLimit) {
		super(accNO, accNm, accBal);
		this.creditLimit = creditLimit;
	}
	public void withdraw(float amount) {
		if(this.getAccBal() > creditLimit+amount) {
			System.out.println("Balance Before Withdrawal: "+this.getAccBal());
			this.setAccBal(getAccBal()-(creditLimit+amount));
			System.out.println(" Account No: "+this.getAccNO()+"\n Account Name: "+this.getAccNm()+"\n Account Balance: "+this.getAccBal()+"\n Withdraw Amount:"+amount);
		} 
		else {
			System.out.println("Cannot Withdraw Minimum balance required is:"+(creditLimit+amount));
		}
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + "]";
	}

}
