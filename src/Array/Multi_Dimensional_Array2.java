package Array;

public class Multi_Dimensional_Array2 
{
	public static void main(String[] args) {
		
		int ar[][]= {{10,20,30},{40,50,60}};
		
		for(int i=0;i<=1;i++)  //outer loop for row
		{
			for(int j=0;j<=2;j++) //inner loop for column
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}

}
