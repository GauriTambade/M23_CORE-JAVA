package com.tns.recursion;

import java.util.Scanner;

public class Assignment2SumOfDigits 
{
	
	
	static int sum(int num)
	{
		if(num/10==0)
		return num;
		else
		return num%10+sum(num/10);
        
	}

	public static void main(String[] args) 
	{
		
		Scanner x=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=x.nextInt();
		System.out.println("Sum of digits of a number= "+sum(num));
		x.close();
        
	}

}

/*o/p
 * 123
6

o/p
111111
6

o/p
1234
Sum of digits of a number= 10

o/p
Enter a number: 
123
Sum of digits of a number= 6

o/p
Enter a number: 
1111111
Sum of digits of a number= 7

o/p
Enter a number: 
666667
Sum of digits of a number= 37


 * */
