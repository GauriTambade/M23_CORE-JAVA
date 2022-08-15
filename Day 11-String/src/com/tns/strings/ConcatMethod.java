package com.tns.strings;

import java.util.Scanner;

public class ConcatMethod {

	public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter first string: ");
		String str=new String(s.nextLine());
		System.out.println("Enter second string: ");
		String str1=new String(s.nextLine());
		System.out.println(str.concat(str1));
          s.close();
	}

}

/*output
 * Enter first string: 
hello 
Enter second string: 
world
hello world*/
