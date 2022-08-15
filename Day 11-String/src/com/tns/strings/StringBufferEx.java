package com.tns.strings;

public class StringBufferEx {

	public static void main(String[] args) {
		String s="Today";
		//StringBuffer sb=new StringBuffer(s);    //o/p=21
		StringBuffer sb=new StringBuffer(s.length()); //o/p=5
		System.out.println(sb.capacity());

	}

}
