package com.cg.inheritance;
class AndroidVersion
{
	void display()
	{
		System.out.println("Android-Version");
	}
}
class Kitkat extends AndroidVersion
{
	void Print()
	{
		System.out.println("Kitkat");
	}
	
}
class Pie extends AndroidVersion
{
	void print1()
	{
		System.out.println("Pie");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) 
	{
	  //create objects for classes
		Kitkat k=new Kitkat();
		Pie p=new Pie();
		k.print();
		p.display();
		p.print1();
				
	}

}
