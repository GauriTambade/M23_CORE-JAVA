package com.cg.oops;
//demo on how to use class and object
class car
{
	//variable
	int a=15;
	//user-defined
	void display()
	{
		System.out.println("Welcome to M23 batch");
}
	}

public class ProgramOnClassAndObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             //object creation
		car obj=new car();
		//accessing the car class method
		obj.display();
		//obj.a=55;
		//accessing the car class variable
		System.out.println(obj.a);
	}

}
