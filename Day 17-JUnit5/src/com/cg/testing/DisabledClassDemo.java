package com.cg.testing;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
//for security. to hide the content.nothing will be printed
/*this class will be disable when you run the code and your all 
the o/p will not print as it is disabled*/
public class DisabledClassDemo
{
	@Test
	void print()
	{
		System.out.println("hey there, I am using disable annotation");
	}

}
