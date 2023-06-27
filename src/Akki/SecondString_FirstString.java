package Akki;

public class SecondString_FirstString
{
	
    public static String searchString(String firstString, String secondString) 
    {
		        if (secondString.contains(firstString))
		        {
		            return secondString + firstString;
		        }
		        return secondString;
    }

    public static void main(String[] args)
		    
    {
		        String firstString = "world";
		        String secondString = "Hello, ";

		        String result = searchString(firstString, secondString);
		        System.out.println(result);
		
    }
	}




