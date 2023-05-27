package Logical_programs;

public class number_swaping_without_variable {
	public static void main(String[]arg)
	{
		int a=10;
		int b=20;
		
		System.out.println("befor swaping a="+a+" b="+b);
         
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swaping a="+a+" b="+b);

	}

}
