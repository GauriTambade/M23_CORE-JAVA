package com.cg.generics;
//demo on advantages of Generics concept
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericsAdvantageDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		List<Integer> obj=new LinkedList<>();

		//List obj=new LinkedList<>();
		obj.add(12);
		//1.Type safety
		//obj.add("gauri");   //string
		//obj.add(12.7);    //float
		System.out.println(obj);

		//typecasting is not required
		List<Integer>obj2=new ArrayList<>();
		obj2.add(15);
		//3.compiletime checking
		//obj2.add("15");  cannot add string

		Integer d=obj2.get(0);
		System.out.println(obj2);

		}

}
