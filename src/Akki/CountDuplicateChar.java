package Akki;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CountDuplicateChar {
	//s1=abcdefabcdef
	
	public static void main(String[] args) {
		String s1="abcdefabcdef";
		char ch[]=s1.toCharArray();// a b c d e f a b c d e f
			
		HashMap<Character,Integer> map=new HashMap(); //(a,2) (b,2),(c,2) (d,2) (e,2) (f,2)

		for(Character c:ch)  //a b c d e f a b
		{
			if(map.containsKey(c))
			{
				//get use for getting value
				map.put(c, map.get(c)+1);  //(b,2)
			}
			else
			{
				map.put(c, 1); // (a,1) (b,1),(c,1) (d,1) (e,1) (f,1)
			}		
		}
		//System.out.println(map);
		
		for(Map.Entry<Character,Integer> e:map.entrySet())
		{
			System.out.print(e.getKey());
			System.out.print(e.getValue());
		}

		
	}

}
