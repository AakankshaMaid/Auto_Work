package Akki;

public class Sample {
	public static void main(String[] args) {
		String s1="india";
		//String rev="";
		s1=s1.toUpperCase();
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			//rev=rev+s1.charAt(i);
			System.out.println(s1.charAt(i));
		}
		
		
	}

}
