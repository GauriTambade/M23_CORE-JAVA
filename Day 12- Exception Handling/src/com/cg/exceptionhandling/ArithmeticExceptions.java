package com.cg.exceptionhandling;

import java.util.Scanner;

public class ArithmeticExceptions {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=15,res=0;
		System.out.println("Enter the value of b: ");
		//try block contains exception and nonexception code
		//handling the exception using catch block
		try
		{
			int b=s.nextInt();
		   res=a/b;
		   System.out.println(res);
		}
		catch(Exception e)
		{
			System.out.println("Exception handlled "+e);
		}
		s.close();
		

	}

}

/*o/p -
 * Enter the value of b: 
5
3

o/p-
Enter the value of b: 
0
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.cg.exceptionhandling.ArithmeticException.main(ArithmeticException.java:12)
*/
