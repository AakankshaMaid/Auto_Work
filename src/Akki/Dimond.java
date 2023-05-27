package Akki;

public class Dimond {
	
		public static void main(String[] args) {
			for(int i=1;i<=5;i++)
			{
				for(int j=4;j>=i;j--)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++)
				{
					System.out.print("* ");
				}
				
				System.out.println(" ");
			}
			for(int z=1;z<=4;z++)
			{
				for(int m=1;m<z;m++)
				{
					System.out.print(" ");
				}
			for(int l=4;l>=z;l--)
			{
				System.out.print(" *");
			}
			
			System.out.println(" ");
			}
		}

	}



