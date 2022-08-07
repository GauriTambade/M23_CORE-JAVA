package com.cg.decisionmaking;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
	//switch
		Scanner s=new Scanner(System.in);
		//int a=s.nextInt();
		//char a=s.next().charAt(0);
		String a=s.nextLine();
		switch(a)
		{
			//case 1:
			//case 'a':
			case "abc":
				System.out.println("Shrivalli");
				break;
			//case 2:
			//case 'b':
			case "def":
				System.out.println("Hello");
				break;
			//case 3:
			//case 'c':
			case "ghi":
				System.out.println("Rita");
				break;
				default:
					System.out.println("invalid input");
					
			
				
				
		}
		s.close();
	}

}


/*o/p
3
Rita

o/p
a
Shrivalli

o/p
abc
Shrivalli

o/p
ab
invalid input*/
