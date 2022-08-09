package com.cg.superKeyword;
class A
{
	protected int pin=6771;
    public void display(int Pin)
    {
    	System.out.println("Pin is "+pin);
    }
}
class B extends A
{
	public int pin=4512;
    public void display(int pin)
    {
    	System.out.println("Pin is "+pin);
    }
    public void print() 
	
    {
    	display(pin);         //child class method
    	super.display(pin);  ///parent class method
    }
}
public class SuperMethod {

	public static void main(String[] args) {
		B b=new B();
		b.print();

	}

}
