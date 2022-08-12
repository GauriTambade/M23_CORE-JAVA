package com.cg.array;

import java.util.Scanner;

public class ArrayDemouserInput {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int size=s.nextInt();
		//array declaration
		int arr[]= new int[size];
		System.out.println("Enter the values: ");
		//to enter the elements in the array
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the " +i+ " index");
			arr[i]=s.nextInt();
		}
		
		/*//to print the elements in the array
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
	}*/
		
		//enhanced for loop
		for(int j:arr)
		{
			System.out.println(j);
		}

	}

}


/*o/p
Enter the size of array 
3
Enter the values: 
Enter the 0 index
12
Enter the 1 index
34
Enter the 2 index
66
12
34
66
*/

/*o/p
Enter the size of array 
4
Enter the values: 
Enter the 0 index
33
Enter the 1 index
44
Enter the 2 index
66
Enter the 3 index
67
33
44
66
67
*/