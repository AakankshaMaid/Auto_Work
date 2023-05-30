package Akki;

import java.util.HashMap;
import java.util.Map;

public class Aaaaa {
	public static void main(String[] args) {
		
		String s1="abcdeabceddd";  
		char ch[]=s1.toCharArray();
		int count=0;
		HashMap<Character, Integer> map=new HashMap();
		
		for(Character c:ch)
		{
			if(map.containsKey(c))
			{
				map.put(c,map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		System.out.println(map);
		
		for(Map.Entry<Character, Integer> o:map.entrySet())
		{
			System.out.println(o);
		}
		
		
		
			}
	

}
