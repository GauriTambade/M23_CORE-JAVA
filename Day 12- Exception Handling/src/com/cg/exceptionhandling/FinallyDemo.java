package com.cg.exceptionhandling;

public class FinallyDemo {
	private static void print(int[] myIntArray) {
		System.out.println(myIntArray[3]);
		System.out.println("Fourth element successfully displayed");
		
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("First line");
		System.out.println("second line");
		try
		{
		
			int[] myIntArray=new int[]{1,2,3};
		       print(myIntArray);
		       //finally block will not execute because of below line
		       //System.exit(0);
		}
		catch(Exception a)
		{
			System.out.println(a);
		}
		
		//if any statement outside try and catch block, that will be executed
		/*finally
		{
			int c=13/0;   //Finally block will not execute if it contains exception
		System.out.println("Finally block is always executed");
		}*/ 
		//System.out.println("Third line");
		finally
		{   
		System.out.println("Finally block is always executed");
		}
		
	}

	
}