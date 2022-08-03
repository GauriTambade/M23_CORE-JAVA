package com.cg.oops;

import java.util.Scanner;

class Vehicle
{
	//variable
	public int a;
	//user-defined
	void display()
	{
		System.out.println("Welcome to M23 batch");
}
	}
public class RuntimeClassAndObjectProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner s1=new Scanner(System.in);
          Vehicle obj=new Vehicle();
          System.out.println("Enter the value of a:  ");
          //int a=s1.nextInt();
         int a=s1.nextInt();
         //obj.a=s1.nextInt();
        // obj1.a=s1.nextInt();
          obj.display();
  		//accessing the car class variable
  		System.out.println(a);
  		s1.close();
	}

}
