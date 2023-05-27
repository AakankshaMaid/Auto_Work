package Generalization;

public class testGeneralization 
{
	public static void main(String[] args)
	{
		current_account c1=new current_account();
		c1.CD();
		c1.CW();
		c1.MT();
		
		System.out.println("----------------");
		
		Saving_account s1=new Saving_account ();
		s1.CD();
		s1.CW();
		s1.MT();
		
		System.out.println("----------------");
		
		Salary_account s2=new Salary_account();
		s2.CD();
		s2.CW();
		s2.MT();
		
	}

}
