package com.tns.strings;

import java.util.Scanner;

public class StringUsingNewKeywordUserInput {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String str=new String(s.nextLine());
		System.out.println("String input is - "+str);
		s.close();
	}

}

/*o/p
 * hello India!
String input is - hello India!*/
 