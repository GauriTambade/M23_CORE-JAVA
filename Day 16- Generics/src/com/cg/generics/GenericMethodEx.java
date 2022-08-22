package com.cg.generics;
//when we use generic method, we can pass any type of argument in the method
public class GenericMethodEx 
{
	public static <E>void printArray(E[] elem)  //printArray( is user defined method
	{
		for(E itr:elem)
		{
			System.out.println(itr.getClass().getName());
			//to check the classname

			System.out.println(itr);
		}
	}
	

	public static void main(String[] args) 
	{
		Integer[] arr1= {10,20,30};
		Character[] arr2={'z','x','a'};
		System.out.println("printing array for Integer");
        printArray(arr1);
        System.out.println("printing array for character");
        printArray(arr2);
        

	}

}

/*o/p
 * printing array for Integer
java.lang.Integer
10
java.lang.Integer
20
java.lang.Integer
30
printing array for character
java.lang.Character
z
java.lang.Character
x
java.lang.Character
a*/
