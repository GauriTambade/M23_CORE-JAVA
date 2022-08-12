package com.cg.thisDemo;

public class DerivedClass extends Base1 
{
  DerivedClass()
  {
	  System.out.println("Default constructor for DerivedClass");
  }
  DerivedClass(int i)
  {
	  this();
	  System.out.println("Parameterized constructor for DerivedClass: "+i);
  }
}
