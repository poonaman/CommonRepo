package com.pack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HashMapAss 
{
	public static void main(String[] args) 
	{
		Map<Integer,Integer> map=new HashMap<>();
		map.put(10,8);
		map.put(2,6);
		map.put(1,4);
		map.put(9,100);
		map.put(null,null);
		map.put(null, null);
		map.put(null,0);
		map.put(4, null);
		map.put(9, null);
		for (Map.Entry<Integer,Integer> key :map.entrySet()) 
		{
			System.out.println(key.getKey()+" "+key.getValue());
	    }
				/*for (Integer key :map.keySet()) 
		{
			   System.out.println(key);
	    }*/
		Map<String, Person> people = new HashMap<String, Person>();

	    Person p1 = new Person("Poonam", 25);
	    Person p2 = new Person("Sayali", 28);
	    Person p3 = new Person("Apeksha", 23);

	    people.put(p1.getName(), p1);
	    people.put(p2.getName(),p2);
	    people.put(p3.getName(), p3);

	    // not yet sorted
	    List<Person> peopleByAge = new ArrayList<Person>(people.values());
	    Collections.sort(peopleByAge);

	    for (Person p : peopleByAge) 
	    {
	        System.out.println(p.getName() + "\t" + p.getAge());
	    }
	
	}
}
