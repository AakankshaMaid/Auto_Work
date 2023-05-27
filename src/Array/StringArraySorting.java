package Array;

import java.util.Arrays; 

public class StringArraySorting
{
	public static void main(String[] args)
	{
		String ar[]=new String[5];
		
		ar[0]="rohan";
		ar[1]="akki";
		ar[2]="vaibhav";
		ar[3]="Abhay";
		ar[4]="rishi";
		
		System.out.println("----print orignal info----");
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		Arrays.sort(ar);  //sort method call
		System.out.println("----print array in asending order----");
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("----print array in decending order---");
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]);
		}
		
	}

}
