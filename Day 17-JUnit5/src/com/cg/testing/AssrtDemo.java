package com.cg.testing;


import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class AssrtDemo
{
	@Test
	public void display()
	{
		int result=5;
		//int expected=8;
		int expected=5;
		//it will check value is equal or not. If it is not equal, it'll show error
		assertEquals(result,expected);
	}

}
