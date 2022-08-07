package com.tns.decisionmaking;

public class NestedIf {

	public static void main(String[] args) {
		int age=15,wt=55;
		//int age=15,wt=130;
		
		//Nested if
		if(age>=12)
		{
			if(wt>=40)
			{
				if(wt<=110)
				{
					System.out.println("Eligible for Bunjee Jumping.");
				}
				else 
				{
					
					System.out.println("Extra ropes will be added.");
				}
			}
				else
				{
					System.out.println("Not eligible for Bunjee Jumping");
				}
			
		}
		else
		{
			System.out.println("Not eligible for Bunjee Jumping");		
		}

	}

}


/*o/p
 * Eligible for Bunjee Jumping.*/
