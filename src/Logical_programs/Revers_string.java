package Logical_programs;

public class Revers_string
{
	public static void main(String[] args) {
		
		String s1="Aakanksha";
		String rev=" ";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
			
		}
		System.out.println(rev);
	
	System.out.println("-------------");
	
	String s2="Akki";
	String s3[]=s2.split("");
	
	for(int k=s2.length()-1;k>=0;k--)
	{
	System.out.print(s3[k]);
	}
	
	}

}
