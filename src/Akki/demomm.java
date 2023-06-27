package Akki;



public class demomm 
{
	public static void main(String[] args) 
	{
		
		String s1="Aaknksha";
		
	char ch[]=s1.toCharArray();
		
		for(int i=0;i<=s1.length()-1;i++)
		{
			for(int j=i+1;j<=s1.length()-1;j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println("duplicate char is:"+ch[i]);
				}
			}
			
		}
		
		
		
		
	
	}

}
