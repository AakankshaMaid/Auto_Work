package Exception_Handling;

public class Multiple_catch_box_For_single_try_box
{
	public static void main(String[] args) {
		
	//multiple catch box for one try box
	String [] s1={"Aakanksha"};
	
	try
	{
		System.out.println(s1[9]);  //risky code
	}
	catch(ArrayIndexOutOfBoundsException e4)
	{
		System.out.println("ArrayIndexOutOfBoundsException");
	}
	
	catch(StringIndexOutOfBoundsException e3)
	{
		System.out.println("String Index Out Of Bounds Exception ");
	}
	catch(IndexOutOfBoundsException e)  
	{
		System.out.println("Index Out Of Bounds Exception ");
	}
	
	System.out.println("hii");

	
	}
}
