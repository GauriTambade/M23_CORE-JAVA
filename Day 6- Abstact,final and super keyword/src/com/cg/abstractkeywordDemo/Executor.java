package com.cg.abstractkeywordDemo;

public class Executor 
{

	public static void main(String[] args) {
		//creation of childclass object as rasMAlai is abstract; we can't instantiate
		Sweet s= new Sweet();
		s.taste();
		s.print();
	}

}
