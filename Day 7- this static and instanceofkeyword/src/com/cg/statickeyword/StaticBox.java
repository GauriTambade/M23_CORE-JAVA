package com.cg.statickeyword;

public class StaticBox 
{
	double width;
	double height;
	static int count;
	//parameterized constructor
	public StaticBox(double width,double height)
	{
		
	}
	public StaticBox()
	{
		super();
		//int cnt=0;
		int cnt=44;                   
		cnt++;
		System.out.println("cnt is: "+cnt);
		count++;
		System.out.println("Count is: "+count);
	}

	public static void main(String[] args)
	{
		//StaticBox s=new StaticBox(11,12);
		StaticBox s=new StaticBox();
		//s.width=23;
		//s.height=6;
		System.out.println(s.width);

	}

}


/*o/p 1
 * cnt is: 45
Count is: 1
0.0
*/
