package com.cg.thiskeyword;
class A
{
	public int num;
	A()
	{
		System.out.println("Welcome to M23 batch");
	}
	A(int num)
	{
		this.num=num;
	}
}
public class InstanceConstructor {

	public static void main(String[] args) {
@SuppressWarnings("unused")
A a=new A();
A b=new A(5);
System.out.println(b.num);
	}

}

/*o/p
 * Welcome to M23 batch
5
*/
