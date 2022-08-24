package com.cg.lambda;

public class MaxFinderTest {

	public static void main(String[] args) {
		MaxFinder obj=(a,b)->a>b?a:b;
		System.out.println("The maximum value is : "+obj.maximum(12,16));

	}

}

/*o/p 
 * The maximum value is : 16*/
