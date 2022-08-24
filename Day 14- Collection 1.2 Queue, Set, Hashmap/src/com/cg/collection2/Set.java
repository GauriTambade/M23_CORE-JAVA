package com.cg.collection2;

import java.util.SortedSet;
import java.util.TreeSet;

public class Set {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		SortedSet s=new TreeSet();
		s.add(44);
		s.add(12);
		s.add(15);
		System.out.println(s);
		

	}

}

/*o/p 
 * [12, 15, 44]
*/
