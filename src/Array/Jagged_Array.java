package Array;

public class Jagged_Array {
	public static void main(String[] args) {
	
	//jagged array means we can initially declared only row size after we can add column size
		int ar[][]=new int[3][];
		ar[0]=new int[3];
		ar[1]=new int [4];
		ar[2]=new int [2];
		int count=0;  //count is to add the data into row column
		for(int i=0;i<=ar.length-1;i++) //outer for loop for row
		{
			for(int j=0;j<=ar[i].length-1;j++) //inner for loop for column
			{
				ar[i][j]=count++; //this condition add data
				System.out.print(ar[i][j]+" ");
			}
			
			System.out.println(); //move to next row
		}
		
	}

}
