package com.pack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListAssignment
{
	public static void main(String[] args) {
		
	
		List<Integer> list=new ArrayList<>();
		
		
		list.add(2);
		list.add(8);
		list.add(5);
		list.add(10);
		list.add(12);
		list.add(9);
		System.out.println(list.size());
		
      /* 
      for(Integer l:list)
		{
			if(l%2==0)
			{
				System.out.println(l);
			}
			else
			{
				list.remove(l);
			}
		} 
		*/
    
		Iterator iter1=list.iterator();
		while(iter1.hasNext())
		{
		int i=(Integer)iter1.next();
		if(i%2==0)
		{
			System.out.println(i);
		}
		else
		{
			iter1.remove();
			System.out.println("Size is"+list.size());
		}
		}
		
    

		
      	
    
	}	

}
