package com.tns.recursion;
import java.util.Scanner;

public class AssignmentFibonacci
{
	 static int fibonacci(int n)
	 {
		 if(n==1)
			 return 0;
		 else if(n==2)
			 return 1;
		 else
			return fibonacci(n-2)+fibonacci(n-1); 
			 
		 }
		

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(fibonacci(n));
		s.close();
	}

}


/*o/p1
 * 5
3     //5th term of fibonacci series is 3

*o/p2
*2
1    //2nd term of fibonacci series is 1 /*/


