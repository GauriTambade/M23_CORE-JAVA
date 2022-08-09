package com.cg.finalkeyword;
class Car
{
	String name;
	//Final method can be inherited but not be overriden
	final void print(String name)
	{
		System.out.println("My name is "+name);
	}
}
class Audi extends Car
{
	
}
public class FinalInheritedMethod {

	public static void main(String[] args) {
		Audi a=new Audi();
		a.print("Audi");

	}

}

//o/p    My name is Audi