package com.cg.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		//ArrayList<Integer>obj=new ArrayList<Integer>();
		List<Integer>obj=new ArrayList<Integer>();

		obj.add(12);
		obj.add(13);
		System.out.println(obj);
		//methods
		System.out.println(obj.contains(5));
		System.out.println(obj.get(1));
		System.out.println(obj.set(0, 15));
		System.out.println(obj);
		System.out.println(obj.isEmpty());
		//copying one list to another
		Object copy;
		copy=obj.clone();
		System.out.println(copy);
		obj.addFirst(9);
		obj.addFirst(91);
		System.out.println(obj);
		
	}

}


//o/p [12, 13]