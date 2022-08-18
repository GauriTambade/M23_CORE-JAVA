package com.cg.list;


import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {


	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		List obj=new ArrayList<>();
		obj.add(11);
		obj.add("Gauri");
		obj.add(56.77);
		obj.add(11);
		obj.add(76);
		System.out.println(obj);
		System.out.println(obj.size());
		obj.remove(2);
		System.out.println(obj);
		System.out.println(obj.indexOf(11));
		System.out.println(obj);
	}

}


/*o/p
 * [11, Gauri, 56.77, 11, 76]
5
[11, Gauri, 11, 76]
0
[11, Gauri, 11, 76] */
