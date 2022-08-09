package com.cg.finalkeyword;
//If any class is declared as final, we can't inherit
//final class Fruit
class Fruit
{
	Fruit()
	//we can't make constrctor final
	//final Fruit()
	{
		System.out.println("Constructor");
	}
}
class Apple extends A
//class Apple extends Fruit
{
	 public void accept()
		{
			System.out.println("parent class");
		}
}
public class FinalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Apple a=new Apple();
           a.accept();
	}

}
