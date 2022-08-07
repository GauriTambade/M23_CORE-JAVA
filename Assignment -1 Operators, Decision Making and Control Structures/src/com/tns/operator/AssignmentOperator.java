package com.tns.operator;

import java.util.Scanner;

public class AssignmentOperator {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		//a*=b;
		//a/=b;
		//a%=b;
		//a+=b;
		a-=b;
	
				System.out.println(a);
		s.close();

	}

}

/*o/p
 * 12
10
120

o/p
20
8
2

o/p
20
6
2

o/p
5
44
49

o/p
12
14
-2
 */

