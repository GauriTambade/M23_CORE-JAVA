package com.cg.array;

import java.util.Arrays;

public class UsingArray {
    static void display(int... a)
    {
    	//Arrays.sort defines Array is a class and sort is a method which sort the values
    	
    	Arrays.sort(a);
    
    for(int i=0;i<a.length;i++)
    {
    	System.out.print(a[i]+ " ");
    }
    }
	public static void main(String[] args)
	{
		display(12,7,88,99,0,55,44);

	}

}

/*o/p
 * 0 7 12 44 55 88 99 */
