package com.cg.package4;
class Car
{
	///protected int a=15;
	//if any variable and method is protected we can access inside the child class
	protected void print()
	{
		System.out.println("Hey, I'm using access specifier");
	}
}
class Mercedes extends Car      //inheritance
{
	/*void print1()
	{
	  System.out.println(a);
	}*/
	//Mercedes class is accessing the properties of Car class
}
/*class D
{
	
}*/
	

public class ProtectedExample {

	public static void main(String[] args) 
	{
		Mercedes m=new Mercedes();
		m.print();
		//D d=new D();
		//System.outprintln(d.a);   error
		///m.print1();                                   //for this, output is 15
	}

}


//output 1  : Hey, I'm using access specifier
//o/p of m.print1 is 15.