package Exception_Handling;

public class Multiple_try_catch_box 
{
	public static void main(String[] args) {
		String s1="abcd";
		int ar[]= {10,20,30,40};
		
		
		try
		{
			System.out.println(s1.charAt(4));
		}
		catch(StringIndexOutOfBoundsException e1)
		{
			System.out.println("String Index Out Of Bounds Exception ");
		}
		try
		{
			System.out.println(ar[5]);
		}
		catch(ArrayIndexOutOfBoundsException e2)
		{
			System.out.println("Array Index Out Of Bounds Exception handel");
		}
		System.out.println("hiii");
	}

}
