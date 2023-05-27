package Akki;

public class Star {
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)  	//1
		{
			for(int j=3;j>=i;j--)  
			{
				System.out.print(" *");
			}
			
			System.out.println(" ");
		}
	}

}
