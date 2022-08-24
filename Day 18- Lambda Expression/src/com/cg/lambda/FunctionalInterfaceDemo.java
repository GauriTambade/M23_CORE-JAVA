package com.cg.lambda;
//functional interface
@FunctionalInterface
interface D
{
	String display(String str);   //abstract method
}
public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		//lambda expression using return statement
		D obj=(String str)->
		{
			return str;
			
		};
		System.out.println(obj.display("Welcome to lambda expression concept"));

	}

}
