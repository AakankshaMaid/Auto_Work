package Akki;

import java.util.HashMap;
import java.util.Map;

public class $HashMap$ {
	//it is a special collection in java which stors key and value form data 
	//key always unique but value should be changing or duplicate also data stored in pair form and in print in random way
	//eg: stdRno. and Name
	  //   key         value
	
	public static void main(String[] args) 
	{ 
		//country(key),population(value)
		
		HashMap<String,Integer> map=new HashMap();
		
		//Insertion operation
		map.put("India", 120);
		map.put("US", 30);
		map.put("China", 150);
		
		System.out.println(map);
		
		map.put("China", 180);  //for update existing value
		
		System.out.println(map);
		
		//search or see exist or not
		if(map.containsKey("India"))
		{
			System.out.println("Key is present");
		}
		else
		{
			System.out.println("Key is not present");
		}
		
		//to see which value is present for the key then use "get()"
		System.out.println(map.get("China")); //180  exist
		System.out.println(map.get("Indonesia"));  //null not exist	1
		
		//Iteration of HashMap
	
		//Map-interface,Entry-Interface 
		for(Map.Entry<String,Integer> e:map.entrySet())
		{
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		
	}

}
