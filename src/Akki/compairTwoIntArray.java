package Akki;

import java.util.Arrays;

public class compairTwoIntArray 
{
	public static void main(String[] args) {
		int ar1[]= {10,20,30,40};
		int ar2[]= {20,30,10,40};
		int ar3[]= {20,30,10,40};
		
		System.out.println(Arrays.equals(ar1, ar2)); //false
		System.out.println(Arrays.equals(ar2, ar3));//true
		System.out.println(Arrays.equals(ar1, ar3));//false
		
	}
	

}
