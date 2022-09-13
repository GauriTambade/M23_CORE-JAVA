package com.cg.framework;

public abstract class ShopFactory
{
 public abstract PrimeAccount getNewPrimeAcc(int AccNo,String accNo, float charges, boolean isPrime);
	public abstract NormalAcc getNewNormalAcc(int AccNo, String accNm, float charges, float deliveryCharges);
	


}