package Constructor;

public class Demo1 {
	int num1;
	int num2;
	 static String name;
	
	Demo1(int a,int b)
	{
		num1=a;
		num2=b;
				
	}
	Demo1(String a)
	{
		name=a;
	}
	public void m1()
	{
		System.out.println(num1+num2);
	}
	public static void m2()
	{
		System.out.println(name);
	}
	

}
