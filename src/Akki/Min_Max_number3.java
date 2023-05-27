package Akki;

public class Min_Max_number3 {
	public static void main(String[] args) {
		
		int ar[]= {10,50,60,70,12};
		
		int max=ar[0];
		
		for(int i=0;i<=ar.length-1;i++)
		{
			if(ar[i]>max)
			{
				max=ar[i];
			}
			
		}
		System.out.println("largest number is: "+max);
	}

}
