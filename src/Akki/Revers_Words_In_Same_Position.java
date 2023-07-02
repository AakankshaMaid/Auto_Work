package Akki;

public class Revers_Words_In_Same_Position {
	public static void main(String[] args) {
		String s1="Chalo ye bhi thik hai";
		String[] s2=s1.split(" ");
		
		for(int i=0;i<=s2.length-1;i++)
		{
			String s=s2[i];
			
			String rev="";
			for(int j=s.length()-1;j>=0;j--)
			{
				rev=rev+s.charAt(j);
			}
			System.out.print(" "+rev);
		}
		//OR	
		
//		for(int i=0;i<=s2.length-1;i++)
//		{
//			
//			//System.out.print(s1.charAt(i));
//			String [] s3=s2[i].split("");
//			String rev="";
//			for(int j=s3.length-1;j>=0;j--)
//			{
//				
//				rev=rev+s3[j];
//				
//			}
//			System.out.print(rev+" ");
//		}
		
	}

}
