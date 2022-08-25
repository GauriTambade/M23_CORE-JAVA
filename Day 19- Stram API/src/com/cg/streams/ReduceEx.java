package com.cg.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceEx {

	public static void main(String[] args) {
		 List<Integer>obj=Arrays.asList(11,22,6,33,44);
		 Optional<Integer>result=obj.stream().filter((i)->i>30).reduce((i,j)->i>j?i:j);
		 //obj.forEach(System.out::println);
         if(result.isPresent())
         {
        	 System.out.print("Result is : "+result.get());
         }
	}

}
/*o/p 
 * Result is : 44
 * */
