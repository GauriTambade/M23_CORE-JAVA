package com.cg.testing;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class RepeatingTestDemo 
{
	@RepeatedTest(5)
	@Test
	void print()
	{
		System.out.println("hey guys, what's going on?");
	}

}

/*o/p
 * hey guys, what's going on?
hey guys, what's going on?
hey guys, what's going on?
hey guys, what's going on?
hey guys, what's going on?
hey guys, what's going on?
*/
