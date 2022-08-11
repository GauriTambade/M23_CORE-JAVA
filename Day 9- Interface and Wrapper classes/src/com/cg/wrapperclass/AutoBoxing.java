package com.cg.wrapperclass;

public class AutoBoxing {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           float a=65.4f;
           Float b=a;  //converting primitive to wrapper class object
           Float f=new Float(87.9);
           System.out.println(a+" "+b+" "+f);
	}

}
