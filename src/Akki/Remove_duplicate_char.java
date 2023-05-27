package Akki;

import java.util.HashSet;

public class Remove_duplicate_char {
	public static void main(String[] args) {
		
		String s1="AKKI";
		
		char ch[]=s1.toCharArray();
		
		HashSet<Character> hs=new HashSet();
		
		
		for(int i=0;i<=s1.length()-1;i++)
		{
			hs.add(ch[i]);
			
		}
		for(Character c:hs)
		{
			System.out.println(c);
		}
	}

}
