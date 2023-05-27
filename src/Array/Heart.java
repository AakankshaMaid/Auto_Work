package Array;

public class Heart {
	public static void main(String[] args) {
		char ar[][]= {{'*','*','*',' ','*','*','*'},{'*',' ',' ','*',' ',' ','*'},
		{'*',' ',' ',' ',' ',' ','*'},{' ','*',' ',' ',' ','*',' '},{' ',' ','*',' ','*',' ',' '},
		{' ',' ',' ','*',' ',' ',' '}};
		
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=6;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		
	
	}
}
