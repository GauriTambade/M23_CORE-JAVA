package com.tns.looping;

public class EnhancedFor {

	public static void main(String[] args) 
	{
		String array[]= {"ASCII","value" };
		int n[]= {77,90};
		for(int x:n)
		{
			System.out.print((char)x+" ");
		}
		for(String str:array)
		{
			System.out.println(str);
		}

	}

}


/*o/p
 * M Z ASCII
value
*/
