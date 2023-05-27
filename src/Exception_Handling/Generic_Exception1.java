package Exception_Handling;

public class Generic_Exception1 
{
	public static void main(String[] args) {
		String s1="abcd";
		
		try
		{
			System.out.println(s1.charAt(4));
		}
		
		
		catch(StringIndexOutOfBoundsException e1)
		{
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			
		}
		catch(Exception e2)   //generic exception
		{
			e2.printStackTrace();
			
		}
		
		
		System.out.println("hiii");
	}
	

}
