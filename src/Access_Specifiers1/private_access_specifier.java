package Access_Specifiers1;

public class private_access_specifier 
{
	private int num1;
	
	private private_access_specifier()
	{
		num1=20;
	}
	
	
	private void m1()
	{
		System.out.println(num1);
	}
	
	public static void main(String[] args) 
	{
		private_access_specifier s1=new private_access_specifier();
		s1.m1();
		
	}
	
	//scope of private access specifier is only within the current class

}
