package Akki;

public class second_Quadrant_Star_pattern 
{
	public static void main(String[] args) {
		int star=1;
		int space=4;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=space;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			star++;
			space--;
			
			
			
			System.out.println(" ");
		}
	}

}
