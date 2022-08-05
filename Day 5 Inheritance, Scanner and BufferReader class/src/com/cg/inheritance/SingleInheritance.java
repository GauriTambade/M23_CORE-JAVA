package com.cg.inheritance;

//program on single inheritance

class Parent
{
	protected int rollno;
	void print()
	{
		System.out.println("Hey guys, what's going on");
	}
	
}
class Child extends Parent
{
	void accept()
	{
		System.out.println("rollno is : "+rollno);
	}
}
public class SingleInheritance {

	public static void main(String[] args) 
	{
		Child c=new Child();
		c.rollno=121;
		c.accept();
		c.print();
				

	}

}


/*o/p
 * rollno is : 121
Hey guys, what's going on
*/
