package com.cg.thiskeyword;
class Main
{
	int x,y;
	//default constructor
	Main()
	{
		x=10;
		y=20;
	}
	Main get1()
	{
		//this keyword is used to return currnt instance variable
		return this;
	}
	public void display()
	{
		System.out.println("Multiplication of x & y is : "+(x*y));
	}
}
public class CurrentClassInstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m=new Main();
				m.get1().display();

	}

}

/*o/p
 * Multiplication of x & y is : 200*/
