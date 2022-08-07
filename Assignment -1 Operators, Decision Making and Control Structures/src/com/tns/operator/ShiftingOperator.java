package com.tns.operator;
//bitwise operator
public class ShiftingOperator {

	public static void main(String[] args) 
	{
		int a=8, b=2;
		int result=a<<b;
		int result1=a>>b;
		
		System.out.println("Left shift: "+result);
		System.out.println("Right shift: "+result1);

	}

}

/*o/p
Left shift: 32
Right shift: 2
-----------------
left shift= a*2^b
right shift= a/2^b

*/