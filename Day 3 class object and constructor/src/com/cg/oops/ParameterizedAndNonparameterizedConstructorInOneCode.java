package com.cg.oops;
class Pulser
{
	public int speed;     
	public String color;  
	//nonparameterized constructor
	Pulser()
	{
		System.out.println("Welcome to TechnoServe India");
	} 
	
	//parameterized constructor
	Pulser(int sp,String col)
	{
		speed=sp;
		color=col;
	}
	void accept()
	{
		System.out.println("speed is: "+speed+"km/hr"+"and color is: "+color);
	}
}
public class ParameterizedAndNonparameterizedConstructorInOneCode {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Pulser p=new Pulser();
		Pulser p1=new Pulser(50,"white");
	       p1.accept();
	       
	       

	}
}

