package com.tns.operator;

public class BitwiseOperator {

	public static void main(String[] args) 
	{
		//bitwise AND &
		int a=5, b=2;
		int result=a&b;
		int result1=a|b;
		int result2=a^b;
		
		System.out.println("bitwise AND: "+result);
		System.out.println("bitwise OR: "+result1);
		System.out.println("bitwise EX-OR: "+result2);

	}

}
