package com.tns.strings;

import java.util.Scanner;

public class StringCreation {

	public static void main(String[] args) {
	String str="Gauri Tambade";
	System.out.println(str);
	Scanner s=new Scanner(System.in);
	String str1=s.next();
	String str2=s.nextLine();
	System.out.println(str1);
	System.out.println(str2);
	s.close();
			
	}

}

/*o/p2 
 * Gauri Tambade
Neha Mahajan
Neha
 Mahajan
*/
