package com.cg.exceptionhandling;



public class NullPointerExceptionHandling {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		//Scanner s=new Scanner(System.in);
		//System.out.println("Enter a string: ");
		//String str=s.nextLine();
		String str=null;
		try
		{
			str.equals("Java");
		}
		catch(Exception e)
		{
			//allocated a new value to str as "Java"
			str=new String("Java");
			//System.out.println("Exception handlled "+e);
			System.out.println(str.equals("Java"));
		}

	}

}

/*o/p
 * true
*/
