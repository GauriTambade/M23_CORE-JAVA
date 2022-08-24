package com.cg.testing;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionDemo 
{
	@Test
	void division()
	{
		System.setProperty("Krutika", "Monika");
		//if assumption is true, then printing statement will print
		//Assumptions.assumeTrue("Monika".equals(System.getProperty("Krutika")));
		//if assumption is false, then printing statement will print
		Assumptions.assumeFalse("Monika".equals(System.getProperty("Kruika")));
		//System.out.println("Assumption is True");
		System.out.println("Assumption is false");
	}

}

//o/p- Assumption is True


//o/p Assumption is false
