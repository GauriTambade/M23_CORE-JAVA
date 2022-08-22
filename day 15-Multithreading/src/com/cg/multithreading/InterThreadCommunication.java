package com.cg.multithreading;
class Seller
{
	int value=10000;
	synchronized void cost(int value)
	{
		System.out.println("Spend value");
		if(this.value<value)
		{
			System.out.println("less value");
			try
			{
				
			}
			catch(Exception e)
			{
				
			}
 
		}
		this.value=this.value-value;
		System.out.println("Process completed");
	}
	synchronized void paid(int value)
	{
		System.out.println("get value");
		this.value=this.value+value;


	}
}
public class InterThreadCommunication {

	public static void main(String[] args) 
	{
		Seller c=new Seller();
		new Thread()
		{
			public void run()
			{
				c.cost(15000);
			}.start();
			new Thread()
			{
				public void run()
				{
					c.cost(10000);
				}.start();
		}

	}

}
