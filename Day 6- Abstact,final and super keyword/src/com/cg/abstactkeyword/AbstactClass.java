package com.cg.abstactkeyword;
//abstract class
//final abstract class Flower //error:The class Flower can be either abstract or final, not both
abstract class Flower
{
	//abstract method
	abstract void print();
	//nonabstract method
	void accept()
	{
		System.out.println("Demo on abstract class");
	}
}
//child class
class Lily extends Flower
{
	void print()
	{
		System.out.println("Hey folks, I like the fragrance of Lily");
	}
}
public class AbstactClass {

	public static void main(String[] args) {
		//Lily l=new Lily();
		//Flower l=new Flower();   //compilation error//we cannot create object for abstract class
		Flower l=new Lily();
		l.print();
		l.accept();

	}

}

/*o/p 1
 * Hey folks, I like the fragrance of Lily
Demo on abstract class*/
