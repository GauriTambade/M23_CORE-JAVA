package com.tns.strings;

import java.util.Scanner;

public class StringLengthUsingCharAt {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
			String str1=new String(s.nextLine());
			System.out.println(str1.length());
			System.out.println(str1.charAt(1));
			System.out.println(str1.toUpperCase());
			System.out.println(str1.toLowerCase());
			s.close();

	}

}

/*o/p 1
 * hello
5
e

*o/p 2
Hello
5
e
HELLO
hello*/
