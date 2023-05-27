package Akki;

public class Extract_no_from_string_and_Add {
	public static void main(String[] args) {
		String s1="Aa5ka3nk7sha";
		int sum=0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			
			if(Character.isDigit(s1.charAt(i)))
			{
				sum=sum+Character.getNumericValue(s1.charAt(i));
				System.out.println(s1.charAt(i));
			}
			
		}
		System.out.println(sum);
		
	}
	

}
