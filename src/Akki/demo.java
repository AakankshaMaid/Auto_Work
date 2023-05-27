package Akki;

import java.util.Arrays;

public class demo {
	public static void main(String[]args)
	{

			int ar[]= {1,2,6,2,3,4,4,6};
			for(int i=0;i<=ar.length-1;i++)
			{
				for(int j=i+1;j<=ar.length-1;j++)
				{
					if(ar[i]==ar[j])
					{
						System.out.println(ar[j]+" is duplicate number");
					}
				}
			}
				
		
		

		
	}

}
