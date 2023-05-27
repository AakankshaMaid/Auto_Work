package Akki;

import java.util.HashSet;

public class Remove_duplicate_Array_Number2 {
	public static void main(String[] args) {
		
		int a[]= {1,2,1,3,4,4,5,6,5};  //not sorted data
		
		HashSet<Integer> hs=new HashSet<Integer>();
		
		for(int i=0;i<=a.length-1;i++)
		{
			hs.add(a[i]);
		}
		
		for(Integer num:hs)
		{
			System.out.println(num);
		}
	}

}
