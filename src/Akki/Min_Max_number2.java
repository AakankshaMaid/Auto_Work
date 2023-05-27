package Akki;

import java.util.Arrays;

public class Min_Max_number2 //without using sorting
{                            
	public static void main(String[] args) {
		int number[]= {15,9,70,45,3,80,66};
		
		int largest=number[0];
		int smallest=number[0];
		
		for(int i=0;i<=number.length-1;i++)
		{
			if(number[i]>largest)
			{
				largest=number[i];
			}
			if(number[i]<smallest)
			{
				smallest=number[i];
			}
		}
		System.out.println("Largest number is: "+largest);
		System.out.println("Smallest number is: "+smallest);
		System.out.println("--------------------");
		System.out.println("Print all Arrays elements: "+Arrays.toString(number));
	}

}
