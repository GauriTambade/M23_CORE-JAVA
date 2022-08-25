package com.cg.streams;

import java.util.HashSet;
import java.util.Set;

public class CollectionLambda {

	public static void main(String[] args) {
	Set<Integer> obj=new HashSet<>();
	obj.add(67);
	obj.add(23);
	obj.add(44);
	System.out.println(obj);
	/*If you want to extract the set values, you
	 *  can go with iterator, while loop and for loop
	 *  but using stream API, we can do it with one line*/
	 
	//extracting the values from set
	obj.forEach(System.out::println);
	}

}

/*o/p 
 * [67, 23, 44]
67
23
44
*/
