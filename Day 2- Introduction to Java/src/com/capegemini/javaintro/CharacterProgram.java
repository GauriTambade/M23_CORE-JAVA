package com.capegemini.javaintro;

import java.util.Scanner;

//program on character
public class CharacterProgram {

	public static void main(String[] args) {
		// compile time input
          //char x='a';
		Scanner s=new Scanner(System.in);
		 System.out.println("Enter value of x ");
		//runtime input
		char x=s.next().charAt(0);
          System.out.println("The character is : "+x);
	}

}


/*output 1
Enter value of x 
gauri
The character is : g  */

/*output 2
 * Enter value of x 
gauri tambade
The character is : g
*/
 