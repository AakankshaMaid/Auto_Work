package Akki;

public class Star_piramid {
	public static void main(String[] args) {
		
		 for(int i=1;i<=5;i++)  //1 2 3
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
	}

}
