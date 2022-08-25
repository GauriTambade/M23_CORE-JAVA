package com.cg.streams;

import java.util.Arrays;
import java.util.List;

public class FilterEx {

	public static void main(String[] args) {
		List<String>obj=Arrays.asList(new String[]{"Shiwani","Gauri","Anjali","Yogesh"});
		//to return a string whose length is greater than 3
        // obj.stream().filter(i->i.length()==7).forEach((i)->System.out.print(i+" "));
        obj.stream().filter(i->i.length()>3).forEach((i)->System.out.print(i+" "));

	}

}

/*o/p
 * Shiwani Gauri Anjali Yogesh */
