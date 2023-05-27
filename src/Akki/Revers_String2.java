package Akki;

public class Revers_String2 {
	public static void main(String[] args) {
		
		String s1="Aakanksha";
		
		String s2[]=s1.split("");  //using split string class method
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			System.out.print(s2[i]);
		}
		
		
	}

}
