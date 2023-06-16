package org.tnsif.framework;

public abstract class SavingAcc extends BankAcc {
	
	private boolean isSalaried;
	static final private float MINBAL=0.0f;

	public SavingAcc(int accNO, String accNm, float accBal, boolean isSalaried) {
		super(accNO, accNm, accBal);
		this.isSalaried = isSalaried;
	}

	public void withdraw(float amount) {
		if (amount>MINBAL) {
			System.out.println("Balance Before Withdrawal: "+this.getAccBal());
			setAccBal(getAccBal()-amount);
			System.out.println(" Account no:"+this.getAccNO()
					+"\n account Name"+this.getAccNm()
					+"\n account balance"+this.getAccBal());
		}else {
			System.out.println("Cannot Withdraw Minimum balance required is:"+ MINBAL);
		}
		
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + "]";
	}
	
}
