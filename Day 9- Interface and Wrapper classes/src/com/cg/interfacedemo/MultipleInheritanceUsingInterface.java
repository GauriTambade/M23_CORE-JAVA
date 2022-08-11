package com.cg.interfacedemo;
//multiple Inheritance using interface
interface Father
{
	void property();
}
interface Mother
{
	void love();

}
class Daughter implements Father,Mother    //here by moving cursor on Daughter
{

	@Override
	public void love() {
		System.out.println("Mother loves ");
	}

	@Override
	public void property() {
		System.out.println("Father gives propert ");
		
	}
	
}
public class MultipleInheritanceUsingInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


