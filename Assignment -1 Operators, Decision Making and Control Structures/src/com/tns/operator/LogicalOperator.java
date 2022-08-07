package com.tns.operator;

public class LogicalOperator {

	public static void main(String[] args) 
	{
	 //logical and
		int a=3, b=7;
		boolean result=(a<b && b<8);
		boolean result1=(a<b || b<8);
		boolean result2=!(a<b);
		
		System.out.println("Logical AND : "+result);
		System.out.println("Logical OR : "+result1);
		System.out.println("Logical NOT : "+result2);

	}

}



/*o/p
Logical AND : true
Logical OR : true
Logical NOT : false


*/