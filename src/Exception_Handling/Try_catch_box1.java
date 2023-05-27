package Exception_Handling;

public class Try_catch_box1 
{
	public static void main(String[] args) 
	{
		String s1="abcd";
		
		try
		{
			System.out.println(s1.charAt(5));
		}
		catch(StringIndexOutOfBoundsException e1)
		{
			System.out.println("StringIndex Out Of Bounds Exception handel" );
		}
		System.out.println("hii");
		System.out.println("hello");
		
	}

}
