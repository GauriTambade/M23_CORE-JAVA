package com.cg.finalkeyword;

public class FinalVariable {
	 
	int FIN_VAR=45;
	//final int FIN_VAR=45;
	public void print()
	{
		final int FIN_VAR=76;
		 FIN_VAR++;
	}
	public static void main(String[] args) {
		//final int FIN_VAR=45;
		//System.out.println(FIN_VAR);
		//FIN_VAR=65;  //error:The value of final local variable FIN_VAR cannot be changed
		FinalVariable f=new FinalVariable();
		System.out.println(f.FIN_VAR);
	}
	

}
