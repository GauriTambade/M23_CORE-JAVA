package com.cg.inheritance;

//program on multilevel inheritance

//parent class
class Bike
{
	protected int speed;
	void display()
	{
		System.out.println("I like to drive a bike");
	}
}

//child class of Bike, // parent class of Pulser125
class Pulser extends Bike
{
	protected String color;
	void print()
	{
		System.out.println("speed is: "+speed);
	}
}
//
class Pulser125 extends Pulser
{
	void accept()
	{
		System.out.println("color is: "+color);
	}
	
}
public class MultiLevelInheritance {

	public static void main(String[] args) 
	{
		
           //object creation 
		Pulser125 p=new Pulser125();
		p.color="black";
		p.speed=60;     //p.methodname
		p.accept();
		p.display();
		p.print();
	}

}

/*o/p
 * color is: black
I like to drive a bike
speed is: 60
*/
