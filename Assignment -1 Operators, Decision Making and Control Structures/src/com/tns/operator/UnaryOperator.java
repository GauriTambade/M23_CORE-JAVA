package com.tns.operator;

public class UnaryOperator {

	public static void main(String[] args) 
	{ 
		//increment
		int a=5,b=3;
		int x=a++; //5
		int y=++b; //4
		int z=a+x; //6+5
		int w=y+z;  //4+11
		System.out.println("a+x= "+z);
		System.out.println("y+z= "+w);
		
		//decrement
	
		int p=a--; //6
		int q=--b; //3
		int r=a+p; //5+6
		int s=b-x;  //3-5
		int t=q+p;  //3+6
		System.out.println("a+p= "+r);
		System.out.println("b-x= "+s);
		System.out.println("q+p= "+t);
		
	
	}

}


/*o/p
 * a+x= 11
y+z= 15
a+p= 11
b-x= -2
q+p= 9
 */



