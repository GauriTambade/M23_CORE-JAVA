package com.cg.package1;
class A
{
	//public int pin=1221;    //for default , we can access
	//public void display()
	//protected int pin=1221; 
	private int pin=1221;
	 void display()
	{
		System.out.println("pin no. is: "+pin);
	}
}
class B extends A
{
	void print()
	{
		System.out.println(pin);
	}
}
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         B a=new B();
         a.display();
	}

}
