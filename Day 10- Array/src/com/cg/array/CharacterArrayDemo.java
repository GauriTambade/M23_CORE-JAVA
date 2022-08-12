package com.cg.array;

public class CharacterArrayDemo {

	public static void main(String[] args) {
		char arr[]={'a','1','z','?','A',' '};
		for(int i=0;i<arr.length;i++)
		{
			if(Character.isDigit(arr[i]))
			{
				System.out.println(arr[i]+" is a digit");
			}
			if(Character.isLetter(arr[i]))
			{
				System.out.println(arr[i]+" is a letter");
			}
			
			if(Character.isWhitespace(arr[i]))
			{
				System.out.println(arr[i]+" is a whitespace");
			}
		if(Character.isUpperCase(arr[i]))
			{
				System.out.println(arr[i]+" is a Uppercase");
			}
			if(Character.isLowerCase(arr[i]))
			{
				System.out.println(arr[i]+" is a Lowercase");
			}
		}
		}
}


/*
 * o/p
 * a is a letter
a is a Lowercase
1 is a digit
z is a letter
z is a Lowercase
A is a letter
A is a Uppercase
  is a whitespace*/
	


