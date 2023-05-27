package Akki;

public class Duplicate_number_find {
	public static void main(String[] args) {
		
		int ar[]= {1,1,2,2,7,4,3,6,4,4};
		
		for(int i=0;i<=ar.length-1;i++)
		{
			for(int j=i+1;j<=ar.length-1;j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.println(ar[i]+"= "+"Duplicate");
				}
				
			}
		}
	}

}
