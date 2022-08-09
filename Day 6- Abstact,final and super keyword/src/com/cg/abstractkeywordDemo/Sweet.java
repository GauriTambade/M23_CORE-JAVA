package com.cg.abstractkeywordDemo;
//concrete class
class Sweet extends RasMalai
{
	//constructor
	public Sweet()
	{
		System.out.println("I like Ras-malai");
	}
	//inonabstract method
	public String taste()
	{
		return "Sweet";
	}
    void display()
    {
	System.out.println("Food is sweet");
}
    void print()
    {
    	System.out.println("Sweet is RasMalai");
    }
}
