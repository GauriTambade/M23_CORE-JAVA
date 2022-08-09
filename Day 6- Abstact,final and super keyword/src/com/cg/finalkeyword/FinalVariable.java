package com.cg.finalkeyword;

public class FinalVariable {
	 
	 int FIN_VAR=45;
	//final int FIN_VAR=45;
	public void print()
	{
		 FIN_VAR=76;
		 
	}
	public static void main(String[] args) {
		//final int FIN_VAR=45;
		//System.out.println(FIN_VAR);
		//FIN_VAR=65;  //error:The value of final local variable FIN_VAR cannot be changed
		FinalVariable f=new FinalVariable();
		System.out.println("The value of FIN_VAR is "+f.FIN_VAR);
		f.print();   //even if FIN_VAR assigned the value 76, it will take 45 because it is declared as final.
	}
	

}

/*o/p
The value of FIN_VAR is 45*/
