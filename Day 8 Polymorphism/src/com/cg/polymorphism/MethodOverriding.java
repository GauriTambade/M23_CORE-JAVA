package com.cg.polymorphism;
//program on method overriding
//one class is not enough. Create 2 or more classes which contains inheritance concept
class Multiplication
{
	void accept(int a, int b)
	{
		System.out.println(a*b);
	}
}
class Mult extends Multiplication
{
	void accept(int x,int y)
	{
		System.out.println(x*y);
	}
}
public class MethodOverriding {

	public static void main(String[] args)
	{
		Mult m=new Mult();
		m.accept(10, 11);
		Multiplication m1=new Multiplication();
		m1.accept(12, 5);
		 
	}

}

/*o/p
 * 110
60*/
