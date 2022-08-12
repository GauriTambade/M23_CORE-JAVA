package com.cg.thiskeyword;
//this() : to invoke current class constructor
class Z
{
	public int x;
	//nonparameterized(default constructor)
	Z()
	{
		this(23);//invoke parameterized constructor
		System.out.println("Default constructor ");
	}
	//parameterized constructor
	Z(int x)
	{
		System.out.println("The value of x is "+x);
	}
}
public class InvokeConstructor {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Z z=new Z();
	}

}


/*o/p
 * The value of x is 23
Default constructor 
*/
