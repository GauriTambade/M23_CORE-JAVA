package com.tns.strings;

import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
		String str1=new String(s.nextLine());
		System.out.println(str1.length());
		s.close();
	}

}


/*o/p 
 * hello
5

o/p
Hello world
11

*/
 