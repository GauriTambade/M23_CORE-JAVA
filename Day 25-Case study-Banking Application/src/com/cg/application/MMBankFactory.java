package com.cg.application;

import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAccount;


public class MMBankFactory extends BankFactory 
{

	@Override
	public SavingAccount getNewSavingAcc(int AccNo, String accNm, float accBal, boolean isSalaried) {
		MMSavingAcc p=new MMSavingAcc(AccNo,accNm,accBal,isSalaried);
		return p;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int AccNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAcc n=new MMCurrentAcc(AccNo,accNm,accBal,creditLimit);
		return n;
	}

	
	

	
}


