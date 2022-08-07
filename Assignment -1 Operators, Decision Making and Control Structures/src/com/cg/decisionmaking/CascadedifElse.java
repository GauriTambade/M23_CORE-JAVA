package com.cg.decisionmaking;

public class CascadedifElse {

	public static void main(String[] args) 
	{
		int a=11,b=7,c=23;
		if(a>b && a>c)
		{
			System.out.println("Greatest value is: "+a);
		}
		else if(b>c && b>a)
		{
			System.out.println("Greatest value is: "+b);
		}
		else
		{
			System.out.println("Greatest value is: "+c);
		}


	}

}

/*o/p
 * Greatest value is: 23*/
