package com.cg.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorLambda {

	public static void main(String[] args) {
		Comparator<String>obj=(s1,s2)->Integer.compare(
				s1.length(),s2.length());
		//String str[]= {"Sumit","Suyog","Shraddha","Monika"};
		String str[]= {"Sumit","Parag","Shraddha","Monika"};
		//here, sort method will arrange the strings in terms of string length
		Collections.sort(Arrays.asList(str),obj);
		for(String i:str)
		{
			System.out.print(i+" ");
		}
	}

}

/*o/p
 * Sumit Suyog Monika Shraddha */ //sorted according to length of strings

/*o/p2 

Sumit Parag Monika Shraddha */