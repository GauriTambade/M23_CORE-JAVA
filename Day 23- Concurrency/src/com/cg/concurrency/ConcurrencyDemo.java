package com.cg.concurrency;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ConcurrencyDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
	//lambda expression for runnable interface9functional interface)
		Runnable r=()->
	{
		try
		{
		TimeUnit.MILLISECONDS.sleep(1000);
		System.out.println("Current time: "+LocalDateTime.now());
	}
		catch(InterruptedException e)
		{
			System.out.println("Exception handled");

		}
	};
	//executors service instance
       ExecutorService obj=Executors.newFixedThreadPool(10);
       obj.execute(r);
       Future<String> res=obj.submit(r,"Done");
       //if task is completed, it returns true; else false
	   while(res.isDone()==false)
	   {
		   try
		   {
			System.out.println("The method returns value:  " +res.get());
            break;
		   }
		   catch(InterruptedException e)
		   {
			   e.printStackTrace();

		   }
		   try
		   {
			  Thread.sleep(1000L); 
		   }
		   catch(InterruptedException e)
		   {
				e.printStackTrace();

		   }
	   }
	   obj.shutdown();
	}

}

/*o/p
 * Current time: 2022-08-29T14:53:34.531838500
Current time: 2022-08-29T14:53:34.531838500*/
 