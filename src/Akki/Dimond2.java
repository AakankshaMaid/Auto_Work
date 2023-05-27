package Akki;

public class Dimond2 {
	public static void main(String[] args) {
		int	star=1;
		int	space=5;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("* ");
			}
			star++;
			space--;
				
			System.out.println();
		}
		int stars=4;
		int spaces=1;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=0;j<=spaces;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=stars;k++)
			{
				System.out.print("* ");
			}
			stars--;
			spaces++;
			
			System.out.println();
		}
	}

}
