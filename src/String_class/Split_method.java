package String_class;

public class Split_method {
	public static void main(String[] args)
	{
	//String s5="my name is abc";
	String s5="velocity";
	String[] ar = s5.split(""); // {my(0) name(1) is(2) abc(3)
	
	System.out.println(ar[4]);
	
	System.out.println(ar.length); //8
	
	System.out.println("------------");
	
	for(int i=0; i<=ar.length-1; i++)
	{
	System.out.println(ar[i]);
	}
	}

}
