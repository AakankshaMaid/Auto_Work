package Array;


import java.util.Arrays;   //import class

public class IntArraySorting
{
	public static void main(String[] args) 
	{
		 int ar[]=new int [5];
		
		ar[0]=40;
		ar[1]=10;
		ar[2]=30;
		ar[3]=50;
		ar[4]=20;
		
		System.out.println("----print orignal info-----");
		
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		
		Arrays.sort(ar);  //array sorting method
		
		System.out.println("-----print array in acending order-----");
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("-----print array in decending order----");
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]);
		}
		
		
		
		
	}

}
