package com.tns.strings;

import java.util.Scanner;

public class StringComparisonAssignment {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String str="Dhoni";
		System.out.println("Enter your string: ");
		Scanner s=new Scanner(System.in);
		
		String str1=new String(s.nextLine());
		
		//System.out.println(str1.equals(str));
		if(str1.equals(str))
		{
			System.out.println("Matching ");	
		}
		else
		{
			System.out.println("Not matching ");	
		}
       s.close();
	}

}

/*o/p 1
 * Enter your string: 
DhonI
false

*o/p 2
*Enter your string: 
Dhoni
true

*o/p 3
Enter your string: 
Rohit
false

o/p 4
Enter your string: 
Dhoni
Matching

 o/p 5
 Enter your string: 
Kohli
Not matching 
*/
