package com.tns.strings;

public class StringBuffEx {
	public static void main(String[] args) {
		
		StringBuffer buff=new StringBuffer("Internet of things"); 
		System.out.println(buff.capacity());
		buff=new StringBuffer(" ");
		System.out.println(buff.capacity());


}
}

/*o/p
34
17*/