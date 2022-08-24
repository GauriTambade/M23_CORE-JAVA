package com.cg.lambda;
//functional interface contains exactly one abstract method
interface A
{
	void print();//abstract method
}

/*class B implements A
{
//length of the code is increased using implementable clas B
	@Override
	public void print() {
System.out.println("functional interface implemented without"+
	" lambda expression");		
	}
	
}*/

public class FunctionalInterfaceImp1 {

	public static void main(String[] args) {
		/*B b=new B();
		b.print();*/
		//1. lambda expression implements the functional interface
		//2.length of code is decreased due to lambda expression
		A obj=()->
		{
			System.out.println("functional interface implemented without"+
					" lambda expression");	
		};
		obj.print();
	}

}


/*o/p 
 * functional interface implemented withoutlambda expression*/
