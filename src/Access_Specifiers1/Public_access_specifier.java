package Access_Specifiers1;
//public access specifier
public class Public_access_specifier //sub class
{
	public int a;
	
	
	public Public_access_specifier()
	{
		a=70;
	}
	
	public void m1()
	{
		System.out.println(a);
	}
	
	public static void main(String[] args)
	{
		Public_access_specifier s1=new Public_access_specifier();
		s1.m1();
	}
}

// public access specifier scope is within whole project 
