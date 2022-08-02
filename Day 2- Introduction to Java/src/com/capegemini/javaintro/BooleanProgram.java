package com.capegemini.javaintro;

import java.util.Scanner;
//boolean datatype
public class BooleanProgram {

	public static void main(String[] args) {
		
        Scanner s=new Scanner(System.in);
        System.out.println("Write the boolean value true/false : ");
       boolean a=s.nextBoolean();
        System.out.println(a);
	}

}


/*output1
Write the boolean value true/false : 
true
true

OUTPUT2
Write the boolean value true/false : 
FALSE
false
*/