package $$Practice$$;



public class Array 
{
	public static void main(String[] args) 
	{
		String s1="ab2h4tyfh6";
		int sum=0;
	    String a=s1.replaceAll("[a-z]", "0");
	
		for(int i=0;i<=a.length()-1;i++)
		{
			sum=sum+Character.getNumericValue(a.charAt(i));
		}
		System.out.println(sum);
		
	}	
	}


