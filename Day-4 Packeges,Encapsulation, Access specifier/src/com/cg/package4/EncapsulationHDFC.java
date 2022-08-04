package com.cg.package4;
//program on encapsulation
import com.cg.package3.HDFC;
public class EncapsulationHDFC {

	public static void main(String[] args) 
	{
		HDFC h=new HDFC();
		h.setAmount(56000);   //calling setters
		System.out.println("The amount in my bank is: "+h.getAmount());//calling getters

	}

}

/*output
 * The amount in my bank is: 56000*/
