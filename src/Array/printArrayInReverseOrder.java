package Array;

public class printArrayInReverseOrder
{
	public static void main(String[] args) 
	{
		int ar[]=new int [5];
		
		ar[0]=10;
		ar[1]=20;
		ar[2]=30;
		ar[3]=40;
		ar[4]=50;
	//ar[5]=60;
		
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("---------------");
		
		for(int i=ar.length-1;i>=0;i--)  //reverse order print
		{
			System.out.println(ar[i]);
		}
		
		
		
	}

}
