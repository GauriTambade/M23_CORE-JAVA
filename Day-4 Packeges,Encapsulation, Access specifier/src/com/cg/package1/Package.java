package com.cg.package1;

public class Package
{
	public int roll_no;
	public String name;
	
	 public void display(int roll_no,String name)
	{
		System.out.println("The roll no is:  "+roll_no  );
		System.out.println("and the name is: "+name);
	}
 
}
//we get output in other program even it is private; because we imported package there