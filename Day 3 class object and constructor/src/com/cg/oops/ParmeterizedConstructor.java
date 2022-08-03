package com.cg.oops;

class Pulser
{
	int speed;     //var.
	String color;   //var.
	//parameterized constructor
	Pulser(int speed,String color)  //constructor
	{
		this.speed=speed;
		this.color=color;
	}
	void accept()
	{
		System.out.println("speed is: "+speed+"km/hr"+"and color is: "+color);
	}
}
public class ParmeterizedConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Pulser p=new Pulser(50,"white");
       p.accept();
	}

}
