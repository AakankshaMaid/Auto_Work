package Akki;

import java.util.Arrays;
public class Min_Max_number1   //we can not use sorting method for the multidimentional array
{
	public static void main(String[] args) {
		
		int ar[]= {15,80,10,6,30,9};
		
		
		Arrays.sort(ar);
		
		System.out.println(ar[0]);
		System.out.println(ar[ar.length-1]);
		
	}

}
