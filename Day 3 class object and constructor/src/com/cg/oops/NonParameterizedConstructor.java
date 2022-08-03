package com.cg.oops;
class Animal
{
	int x;
	//non parameterized constructor
	Animal()
	{
		x=15;
	}
	void display()
	{
		System.out.println("Lion"+x);
	}
	}
public class NonParameterizedConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Animal a=new Animal();
       a.display();
	}

}
