package com.tns.strings;

public class StringComparison {

	public static void main(String[] args) {
		//String str="Hello";
		//String str1="Hello";
		//String str=new String("Hello");
		String str="Hello";                //string literal
		String str1=new String("Hello");   //newkeyword
		String str2=new String("Hello");
         System.out.println(str==str1);   // == checks memory allocation
         System.out.println(str1.equals(str));
         System.out.println(str.equals(str2));//'equals' compares the string content
	}

}

/*o/p 1- 
 * true
 * 
 * o/p2-
 * false
 * 
 * o/p 3-
 * false
true
*/
