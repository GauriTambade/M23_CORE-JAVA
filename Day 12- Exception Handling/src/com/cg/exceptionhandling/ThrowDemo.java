package com.cg.exceptionhandling;

public class ThrowDemo 
{
	//throws keyword is used to declare an exception
	public static void display(int age, int weight) throws Exception
	{
		if(age>18 && weight>45)
			System.out.println("Eligible to donate the blood");
		else
		{
			//to throw an exception explicitly
			throw new Exception("Exception cought");
		}
	}
	public static void main(String args[])
	{
		try
		{
			//display(22,54);    //o/p- Eligible to donate the blood
			display(15,54); 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
