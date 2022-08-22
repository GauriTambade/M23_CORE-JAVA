package com.cg.multithreading;
//program on Synchronized block
class A
{
	void print(int var)
	{
		synchronized(this)       //synchronized method
		{
			for(int i=1;i<=3;i++)
			{
				System.out.println(var*i);
				try
				{
					Thread.sleep(400);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		}
	}
}
class B extends Thread
{
	A obj;
	B(A obj)
	{
		this.obj=obj;
	}
	public void run()
	{
		obj.print(50);
	}
}
public class Synchronization {

	public static void main(String[] args) {
		A a=new A();
		B b1=new B(a);
		B b2=new B(a);
		b1.start();
		b2.start();
		

	}

}

/*o/p 
 * 50
100
150
50
100
150
*/
