package Akki;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class $HashMap$ {
	//it is a special collection in java which stors key and value form data 
	//key always unique but value should be changing or duplicate also data stored in pair form and in print in random way
	//eg: stdRno. and Name
	  //   key         value
	
	public static void main(String[] args) 
	{ 
		//country(key),population(value)
		
		HashMap<String,Integer> map=new HashMap();
		
		//1:put(k,v)-->use to insert value in hashmap
		map.put("India", 120);
		map.put("US", 30);
		map.put("China", 150);
		
		System.out.println(map);
		//2:put(k,v)-->update value of already existing key
		map.put("China", 180);  //for update existing value
		
		System.out.println(map);
		
		//3:containsKey()-->to verify specific key present or not
		if(map.containsKey("India"))
		{
			System.out.println("Key is present");
		}
		else
		{
			System.out.println("Key is not present");
		}
		
		//4: get(key) -> get value of specific key
		System.out.println(map.get("China")); //180  exist
		System.out.println(map.get("Indonesia"));  //null not exist	1
		System.out.println("---------------");
		
		//5: keyset() -> to get all keys from hashmap
		Set<String> allkeys = map.keySet();
		for(String key:allkeys)
		{
			System.out.println(key);
		}
		//6: get all keys & values
				for(String key:allkeys)
				{
					System.out.print(key+"-"+map.get(key));
				}	
		
	
		//Map-interface,Entry-Interface 
		for(Map.Entry<String,Integer> e:map.entrySet())
		{
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		
	}

}
