package com.cg.superKeyword;
class Android

{

	Android()
	{
		//this.name=name;   //this used because const. name and class name is same
		System.out.println("Lava class Android mobile");
	}
	
}
class Lava extends Android
{

	/*Lava(String name) {
		super(name);
		System.out.println("Lava class constructor");
	}*/
	Lava()
	{
		//Android class constructor
		super();
		System.out.println("hello all");
	}
	
}
public class SuperConstructor {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Lava l=new Lava();
		

	}

}
