package Akki;

import java.util.Arrays;

public class abcd
{
	public static void main(String...args) {
		int space=5;
		int star=1;
		
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("* ");
			}
			System.out.println();

			if(i<5)
			{
				star++;
				space--;
			}
			else if(i==6)
			{
				star--;
				//break;
				space++;
				
			}
			else if (i>6)
			{
				star--;
				space++;
			}
		}
	}
}
