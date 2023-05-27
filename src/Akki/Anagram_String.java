package Akki;

import java.util.Arrays;

public class Anagram_String {
//two words which has same words but in different in position i.e HEART and EARTH
	
	public static void main(String[] args) {
		
		String s1="HEART";
		String s2="EARTH";
		
		char ch1 []=s1.toCharArray();
		char ch2 []=s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		boolean result=Arrays.equals(ch1, ch2);
		
		if(result)
		{
			System.out.println(s1+" "+s2+" "+"is anagram string");
		}
		else
		{
			System.out.println(s1+" "+s2+" "+"is not anagram string");
		}
		
	}

}
