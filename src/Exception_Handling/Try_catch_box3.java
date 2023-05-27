package Exception_Handling;

public class Try_catch_box3
{
	public static void main(String[] args)
	{
		int num1=10;
		int num2=0;
		int div=0;
		
		try
		{
			div=num1/num2;
		}
		catch(ArithmeticException e1)
		{
			//div=num1/1;
			System.out.println("Arithmetic Exception habdel");
		}
		System.out.println(div);
		System.out.println("hii");
		
	}

}
