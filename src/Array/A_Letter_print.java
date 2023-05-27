package Array;

public class A_Letter_print {
	public static void main(String[] args) {
		char c [][]= {{' ',' ',' ',' ',' ','$',' ',' ',' ',' ',' '},{' ',' ',' ',' ','$',' ','$',' ',' ',' ',' '},
				{' ',' ',' ','$','$','$','$','$',' ',' ',' '},{' ',' ','$',' ',' ',' ',' ',' ','$',' ',' '},
				{' ','$',' ',' ',' ',' ',' ',' ',' ','$',' '}};
		
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=10;j++)
			{
				System.out.print(c[i][j]);
			}
			
			
			System.out.println();
		}
	}

}
