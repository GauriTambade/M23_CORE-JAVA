package com.cg.collections;

import java.util.Stack;

public class Slack {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) 
	{
		Stack s=new Stack();
		s.add(10);
		s.add(20);
		//s.pop();
		s.remove(0);
		System.out.println(s);
		
	}

}
