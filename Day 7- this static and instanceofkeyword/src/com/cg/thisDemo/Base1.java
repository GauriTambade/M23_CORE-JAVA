package com.cg.thisDemo;

public abstract class Base1 
{
	Base1()
	{
		this(65);
		System.out.println("default constructor for Base1: ");
	}
	Base1(int i)
	{
		 System.out.println("Parameterized constructor for Base1 "+i);
	}

}
