package Akki;

public class Revers_Words_In_Same_Position2
{
	public static void main(String[] args) 
	{
		String s1="my name is abc";
		String s2[]=s1.split(" ");
		
		for(int i=0;i<=s2.length-1;i++)
		{
			String words=s2[i];
			System.out.print(m1(" "+words));
		}
		
		
	}
	public static String m1(String words)
	{
		String rev="";
		for(int i=words.length()-1;i>=0;i--)
		{
			rev=rev+words.charAt(i);
		}
		return rev;
	}

}
