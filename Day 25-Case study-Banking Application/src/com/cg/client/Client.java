package com.cg.client;

import com.cg.application.MMBankFactory;
import com.cg.application.MMCurrentAcc;
import com.cg.application.MMSavingAcc;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAccount;

public class Client {

	public static void main(String[] args) {
		MMBankFactory s=new MMBankFactory();
		SavingAccount p=new MMSavingAcc(1001,"Gauri Tambade ",500, true);
		CurrentAcc n=new MMCurrentAcc(1002,"Pooja Tambade ",500, 50);
		System.out.println("Saving Account: ");
		p.creditLimit(500);
		
		System.out.println("Current Account: ");
		n.creditLimit(500);
		
		
		System.out.println(p);
		System.out.println(n);



		

	}

}