package com.tns.recursion;
import java.util.Scanner;
//finding nth term of fibonacci series
public class AssignmentFibonacci
{
	 static int fibonacci(int n)
	 {
		 //first 2 terms of series are 0 & 1
		 if(n==1)
			 return 0;
		 else if(n==2)
			 return 1;
		 else
			return fibonacci(n-2)+fibonacci(n-1);      //n^th term = (n-1)^th term +  (n-2)^th term
			                                           //function calling in function itself
		 }
		

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n");   
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
1    //2nd term of fibonacci series is 1 

o/p
Enter the value of n
 7
8
*/


