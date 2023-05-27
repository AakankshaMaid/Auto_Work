package Types_of_variables;

public class Local_varible {
	public static void main(String[] args)    //the variable which decleard in method is local variable
	{
		int i=10;              //local varible ----->temprory variable
		System.out.println(i);
		m1();
		
	}
	
	public static void m1()
	{
		int i=5;               //local variable
		System.out.println(i);
	}
	
	public void m2()
	{
		int i=6;                //local variable
		System.out.println(i);
	}

}
