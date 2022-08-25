package com.cg.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BasicStreamDemo {

	public static void main(String[] args) {
	Stream<String>obj=Stream.of("Priyanka","Gauri","Ashutosh","Devyani");
   //terminal operation forEach
	obj.forEach((i)->System.out.print(i+" "));
   System.out.println();    //for giving space
   //stream can be
     List<Integer>obj1=Arrays.asList(new String[]("78","56","23","45"));
     obj=obj1.stream();
     obj.forEach(System.out::println());
	}

}
