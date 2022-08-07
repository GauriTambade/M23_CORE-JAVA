package com.tns.operator;

import java.util.Scanner;

public class RelationalOperator {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		boolean rea=a>b;
		boolean less=a<b;
		boolean equal=a==b;
		System.out.println(rea);
		System.out.println(less);
		System.out.println(equal);
		s.close();

	}

}


/*o/p 1
12 14
false

*o/p 2
15
11
true*/

/*o/p for ==
12
12
true*/