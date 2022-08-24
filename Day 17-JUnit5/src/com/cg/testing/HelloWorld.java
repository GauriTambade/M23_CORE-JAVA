package com.cg.testing;

import org.junit.jupiter.api.Test;

public class HelloWorld implements TestLifeCycleLogger
{
	@Test
	void print()
	{
		System.out.println("Hello world");

	}

}

/*o/p 
 * Before all test
Test Method
Hello world

o/p2
Before all test
Hello world
Test Method

*/
