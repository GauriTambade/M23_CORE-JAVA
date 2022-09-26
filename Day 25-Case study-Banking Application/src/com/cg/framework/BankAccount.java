package com.cg.framework;

public abstract class BankAccount 
{
	protected int accNo;
	private String accNm;
	private float accBal;
	//constructor
	public BankAccount(int accNo, String accNm, float accBal) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	//getter and setter
	
	
	
	
	






	abstract public void minBal(float accBal);
	public int getAccNo() {
		return accNo;
	}











	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}











	public String getAccNm() {
		return accNm;
	}











	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}











	public float getAccBal() {
		return accBal;
	}











	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}











	public void items(float accBal)
	{
		System.out.println(accBal);
	}











	@Override
	public String toString() {
		return String.format(
				"BankAccount [accNo=%s, accNm=%s, accBal=%s, getAccNo()=%s, getAccNm()=%s, getAccBal()=%s]", accNo,
				accNm, accBal, getAccNo(), getAccNm(), getAccBal());
	}









}


