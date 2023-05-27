package Access_Specifiers1;
//protected access specifier   
public class Protected_access_specifier   //super class
{
	protected int a;
	
	protected Protected_access_specifier()
	{
		a=90;
	}
	
	protected void m1()
	{
		System.out.println(a);
	}
	
	public static void main(String[] args)
	{
		Protected_access_specifier s1=new Protected_access_specifier();
		s1.m1();
		
	}
	
	//scope of protected access specifier is only within the package you can access in other package with one condition i.e.performing inheritance

}
