package Akki;

public class demo1 {
	public static void main(String[] args) {
		int star=1;
		int space=5;
		
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
			space--;
			star++;
			System.out.println();
		}
		int star1=4;
		int space1=1;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=0;j<=space1;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star1;k++)
			{
				System.out.print("* ");
			}
			space1++;
			star1--;
			System.out.println();
		}
		
	}

}
