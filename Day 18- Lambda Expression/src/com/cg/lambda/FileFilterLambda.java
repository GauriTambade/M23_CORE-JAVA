package com.cg.lambda;

import java.io.File;
import java.io.FileFilter;

public class FileFilterLambda {

	public static void main(String[] args) {
		/*lambda expression for searching the file in given path
		of particular extention*/
		FileFilter filter=(File pathname)->pathname.getName().endsWith(".rtf");
		//FileFilter filter=(File pathname)->pathname.getName().endsWith(".txt");
		//FileFilter filter=(File pathname)->pathname.getName().endsWith(".pptx");
		File dir=new File("C:\\Users\\lenovo\\Desktop\\java full stack");
		File contents[]=dir.listFiles(filter);
		//enhanced for loop 
		/*if any particular extention file is open on your system then
		you will get that file 2 times one with $ sign*/
		for(File i:contents)
		{
			System.out.println(i);
		}
	}

}

/*o/p1
 * C:\Users\lenovo\Desktop\java full stack\Assignment-2_Function And Recursion in java.pptx
C:\Users\lenovo\Desktop\java full stack\DAY 07 this,static and instanceOf keyword.pptx
C:\Users\lenovo\Desktop\java full stack\DAY-11_String ,StringBuffer,StringBuilder and StringTokenizer.pptx
C:\Users\lenovo\Desktop\java full stack\Day-13_Collection1.1(Intro,ArrayList and LinkedList).pptx
C:\Users\lenovo\Desktop\java full stack\DAY-17_Multithreading.pptx
C:\Users\lenovo\Desktop\java full stack\DAY03_OOP's.pptx
C:\Users\lenovo\Desktop\java full stack\DAY04 packages,Encapsulation,Abstraction and Access modifiers.pptx
C:\Users\lenovo\Desktop\java full stack\Day14_Collection1.2(Queue,set and Map) (1).pptx
C:\Users\lenovo\Desktop\java full stack\Day14_Collection1.2(Queue,set and Map).pptx
C:\Users\lenovo\Desktop\java full stack\DAY_05 Inheritance, Scanner and BufferReader class.pptx
C:\Users\lenovo\Desktop\java full stack\DAY_06 abstract,final and super keyword.pptx
C:\Users\lenovo\Desktop\java full stack\Day_08_Polymorphism.pptx
C:\Users\lenovo\Desktop\java full stack\Day_Assignment1- after 5th day-_Looping and Jumping statement_Assignment.pptx
C:\Users\lenovo\Desktop\java full stack\students Expectations from trainer.pptx
*/
 