package com.cg.streams;

import java.util.Arrays;
import java.util.List;

public class FilteringDemo {

	public static void main(String[] args) {
        List<Integer>obj=Arrays.asList(11,22,33,44);
       // obj.stream().filter(i->i>25).forEach(System.out::println);//for each -to print
        obj.stream().filter(i->i>25).forEach((i)->System.out.print(i+" "));
        System.out.println();
        System.out.println("The distinct elements are: ");
        obj.stream()
.distinct().forEach((i)->System.out.print(i+" "));
        System.out.println();
        System.out.println("The Limit is: ");
        obj.stream()
.limit(2).forEach((i)->System.out.print(i+" "));
        System.out.println();
        }

}

/*o/p 
 * 33 44 
The distinct elements are: 
11 22 33 44 

o/p
33 44 
The distinct elements are: 
11 22 33 44 The Limit is: 
11 22 
*/
