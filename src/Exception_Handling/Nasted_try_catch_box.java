package Exception_Handling;

public class Nasted_try_catch_box 
{
	public static void main(String[] args) {
		String s1="Aakanksha";
		int ar[]= {60,70,80,90,100};
		
		try
		{
			
			try
			{
				System.out.println(ar[6]);
			}
			catch(ArrayIndexOutOfBoundsException e1)
			{
				System.out.println("Array Index Out Of Bounds Exception handel");
			}
			System.out.println(s1.charAt(10));
		}
		catch(StringIndexOutOfBoundsException e2)
		{
			System.out.println("String Index Out Of Bounds Exception handel");
		}
		System.out.println("hii");
		
	}

}
