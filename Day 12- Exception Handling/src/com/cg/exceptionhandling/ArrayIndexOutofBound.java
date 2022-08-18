package com.cg.exceptionhandling;

public class ArrayIndexOutofBound {
	

	public static void main(String[] args) {
		System.out.println("First line");
		System.out.println("second line");
		try
		{
		
			int[] myIntArray=new int[]{1,2,3};
		       print(myIntArray);
		}
		catch(Exception a)
		{
			System.out.println(a);
		}
		//if any statement outside try and catch block, that will be executed
		System.out.println("Third line");

	}

	private static void print(int[] myIntArray) {
		System.out.println(myIntArray[3]);
		System.out.println("Fourth element successfully displayed");
		
	}

	

}
