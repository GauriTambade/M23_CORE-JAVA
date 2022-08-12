package com.cg.statickeyword;

public class StaticBlock 
{
	static int a;
	static String name;
	@SuppressWarnings("static-access")
	StaticBlock(int a, String name)
	{
		this.a=a;
		this.name=name;
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		StaticBlock s=new StaticBlock(a,name);
		s.a=34;
		s.name="Gauri";
		System.out.println(a);
		System.out.println(s.name);

	}

}
