package com.tns.recursion;

import java.util.Scanner;

public class Assignment2SumOfDigits 
{
	

	static int sum(int n)
	{
	
		int s=n/10+n%10;
		//int s=n/10;
		//int t=s/10;
		//int u=n%10;
		if(n/10==0)
			return s;
		else return (sum(n));
			
	

		
		
		
	
		
		
	}

	public static void main(String[] args) 
	{

		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		System.out.println(sum(n));
		x.close();
        
	}

}
