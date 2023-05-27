package Exception_Handling;

public class Try_catch_box2 
{
	public static void main(String[] args) 
	{
		int [] ar= {10,20,30,40};
		
		try 
		{
			System.out.println(ar[9]);  //risky code
		}
		catch(ArrayIndexOutOfBoundsException s1)
		{
			System.out.println(ar[0]);  //alternate solution
			System.out.println(" Exception handel");
		}
		System.out.println("good night");
	}

}
