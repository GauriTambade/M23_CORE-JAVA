package com.cg.package4;

public class DemoPublic 
{
	// int a,b;        //we can access a, b in same package even if it is not public()default 
	//public int a,b; 
	private int a,b; 
	// void display(int a,int b)
	public void display(int a,int b)
	{
		System.out.println("Addition is"+(a+b));
	}

}
