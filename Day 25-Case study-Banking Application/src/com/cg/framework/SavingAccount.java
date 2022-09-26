package com.cg.framework;

public abstract class SavingAccount extends BankAccount
{

	private boolean isSalaried;
	
	static final private float minBal=0.0f;
	//constructor
	
	
	@Override
	public String toString() {
		return String.format("SavingAccount [isSalaried=%s, toString()=%s]", isSalaried, super.toString());
	}

	public void creditLimit(float minBal)
	{
		System.out.println("Account No: "+this.getAccNo()+" "+"Account Name: "+this.getAccNm()
		+"accBal is: "+this.getAccBal());
	}

	protected SavingAccount(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
	}

	public static float getMinbal() {
		return minBal;
	}

}