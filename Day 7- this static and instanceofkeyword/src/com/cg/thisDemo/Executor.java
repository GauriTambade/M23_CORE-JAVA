package com.cg.thisDemo;

public class Executor {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     DerivedClass d=new DerivedClass();
     DerivedClass d1=new DerivedClass(33);
     
	}

}

/*o/p 
 *default constructor for Base1: 
Default constructor for DerivedClass
Parameterized constructor for Base1 65
default constructor for Base1: 
Default constructor for DerivedClass
Parameterized constructor for DerivedClass: 33
 */
