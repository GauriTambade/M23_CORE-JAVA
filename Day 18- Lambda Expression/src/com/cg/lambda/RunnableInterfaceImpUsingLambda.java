package com.cg.lambda;
//
public class RunnableInterfaceImpUsingLambda {

	public static void main(String[] args) 
	{
	/*	//runnable interface
Runnable R1=new Runnable()
{
	public void run()
	{
		System.out.println("Runnable interface implementation");
	}
};*/
		
Thread t=new Thread(R1);
t.start();
	}

}
