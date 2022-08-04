package com.capgemini.javaintro;

import java.util.Scanner;
//program on string input
public class StringProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Write the String input");
        //next will take only first word 
        //nextline will take entire line
        String str=sc.next();
        //String str=sc.nextLine();
        System.out.println(str);
	}

}

/*output 1
 * Write the String input
 Gauri Satish Tambade
Gauri
*/
 
/*output 2
 * Write the String input
Gauri Satish Tambade
Gauri Satish Tambade
*/
