package com.capgemini.javaintro;
///program to get float input from user

import java.util.Scanner;

public class FloatInput {

	public static void main(String[] args) {
		
		  Scanner s=new Scanner(System.in);
          System.out.println("Enter value of x ");
          float x=s.nextFloat();
          System.out.println(x);
	}

}


/*output1
Enter value of x 
22.555
22.555

output2
Enter value of x 
44
44.0
*/