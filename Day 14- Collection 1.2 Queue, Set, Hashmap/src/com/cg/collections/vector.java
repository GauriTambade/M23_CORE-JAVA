package com.cg.collections;

import java.util.Vector;

public class vector {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		@SuppressWarnings("rawtypes")
		Vector v=new Vector();  //vector declaration

		v.add(65);
		v.add("people");
		v.add(65);
	
		System.out.println(v);
		
	}

	
}

/*o/p 
 *[65, people, 65]
 */
