package com.cg.framework;

public abstract class CurrentAcc extends BankAccount
{
private final float creditLimit;
	
	//constructor
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}

	
	@Override
	public String toString() {
		return String.format("CurrentAcc [creditLimit=%s]", creditLimit);
	}


	public void creditLimit(float accBal)
	{
		System.out.println("Account No: "+this.getAccNo()+"Account Name: "+this.getAccNm()
		+"accBal is: "+(accBal+creditLimit));
	}


	public float getCreditLimit() {
		return creditLimit;
	}

}


