package Exception_Handling;

public class Generic_Exception 
{
	public static void main(String[] args) {
		
		String s1="Akki";
		
		try
		{
			System.out.println(s1.charAt(4)); //risky code
		}
		catch(Exception e)   //generic exception
		{
			e.printStackTrace();  //call this method for find the exact exception
		}
		System.out.println("Hello");
		
	}

}
