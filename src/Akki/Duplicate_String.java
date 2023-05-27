package Akki;

public class Duplicate_String {
	public static void main(String[] args) {
		
		String s1="Aakankshha";
		char[]ch=s1.toCharArray();
		//              9
		for(int i=0;i<=s1.length()-1;i++)
		{  //                 9
			for(int j=i+1;j<=s1.length()-1;j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println("Duplicate string charecter are "+ch[j]);
				}
			}
		}
	}

}
