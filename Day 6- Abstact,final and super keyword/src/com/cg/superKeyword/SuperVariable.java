package com.cg.superKeyword;
class Color
{
	protected String name="Orange";
	protected void display()
	{
		System.out.println("Color is "+name);
	}
}
//child class
class Blue extends Color
{
	public String name="Blue";
	public void display()
	{
		System.out.println("Color is "+name);
		//super keyword is used to refer the parent class variable
		System.out.println(super.name);
	}
	
}
public class SuperVariable {

	public static void main(String[] args) {
		Blue b=new Blue();
		//System.out.println(b.name);
		//System.out.println(super b.name); //Cannot use super in a static context
	   b.display();
	}

}
