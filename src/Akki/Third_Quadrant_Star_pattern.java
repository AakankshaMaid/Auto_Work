package Akki;

public class Third_Quadrant_Star_pattern {
	public static void main(String[] args) {
		int star=5;
		int space=0;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=star;k>=1;k--)
			{
				System.out.print("*");
			}
			star--;
			space++;
			
			
			
			
			
			System.out.println(" ");
		}
	}

}
