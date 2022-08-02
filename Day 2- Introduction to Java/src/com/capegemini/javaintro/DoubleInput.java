package com.capegemini.javaintro;

import java.util.Scanner;

public class DoubleInput {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
         System.out.println("Enter value of x ");
         double x=s.nextDouble();
         System.out.println(x);

	}

}


/*output 1
  Enter value of x 
55.66
55.66*/
 
/*output 2
Enter value of x 
55
55.0*/

/*output 3
Enter value of x 
55.777
55.777 */