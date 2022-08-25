package com.cg.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappingEx {

	public static void main(String[] args) {
		List<Integer>obj1=Arrays.asList(new Integer[] {20,4,2,5});
		//collections class
		List<Integer>obj2=obj1.stream().map(i->i*i).collect(Collectors.toList());
		obj1.stream().map(i->i*i).forEach((i)->System.out.print(i+" "));
		
	}

}
