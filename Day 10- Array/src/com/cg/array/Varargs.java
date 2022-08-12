package com.cg.array;

public class Varargs 
{
	//static: used to get method without creating object
	static void print(int a, int b, String...  s)  //  (... ) ellipses
	{
		System.out.println(a+" ,"+b);
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]+"\t");
		}
	}
	public static void main(String[] args) 
	{
	
		//function call
		print(13,65,"Python","Java","C++","C","HTML");
	}

}

/*o/p
 * 13 ,65
Python	
Java	
C++	


o/p2
13 ,65
Python	
Java	
C++	
C	
HTML	
*/
