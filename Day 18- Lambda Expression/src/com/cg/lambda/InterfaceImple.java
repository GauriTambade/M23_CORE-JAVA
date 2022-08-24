package com.cg.lambda;
interface C
{
	void display();
	//void accept();
}
public class InterfaceImple {

	public static void main(String[] args) {
		C obj=()->
				{
			System.out.println("functional interface implementation using "+
				"lambda expression");
				};
				obj.display();
				

	}

}
