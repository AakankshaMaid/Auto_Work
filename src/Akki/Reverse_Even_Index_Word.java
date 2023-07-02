package Akki;

public class Reverse_Even_Index_Word 
{
	public static void main(String[] args) 
	{
		String str="my name is abc";
		String s1[]=str.split(" ");
		for(int i=0;i<=s1.length-1;i++)
		{
			String s2=s1[i];
			if(i%2==0)
			{
				String rev=m1(s2);
				System.out.print(" "+rev);
			}
			else
			{
				System.out.print(" "+s2);
			}
		}
		
	}
	public static String m1(String s2)
	{
	  String rev="";
	  for(int j=s2.length()-1;j>=0;j--)
	  {
		  rev=rev+s2.charAt(j);
	  }
	  return rev;
	}
		
	

}
