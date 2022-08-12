package com.cg.array;
class Student
{
	public int roll_no;
	public String name;
	//constructor
	Student(int roll_no,String name)
	{
		this.roll_no=roll_no;
		this.name=name;
	}
}
public class StudentArray {

	public static void main(String[] args) {
		//nonprimitive array memory allocation
		Student[] arr=new Student[3];
		arr[0]=new Student(101,"Gauri");
		arr[1]=new Student(102,"Anjali");
		arr[2]=new Student(102,"Dhara");
		for(int i=0;i<arr.length;i++)
		{
			
        System.out.println("Element at "+i+" index: "+arr[i].roll_no+" "+arr[i].name);
	}

}
}

/*o/p
 *Element at 0 index: 101 Gauri
Element at 1 index: 102 Anjali
Element at 2 index: 102 Dhara
*/
