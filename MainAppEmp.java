package com.pack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MainAppEmp 
{
	public static void Sort(Map<Employee,Employee> maps)
	{
		Map<Employee,Employee> map12=new TreeMap<Employee,Employee>(maps);
        for (Map.Entry<Employee,Employee> key :map12.entrySet()) 
		{
			 Employee emp=(Employee)key.getValue();
			 System.out.println(emp.getName()+" "+emp.getId()+" "+emp.getAge()+" "+emp.getSal());
	    }
		
	}

	public static void main(String[] args) 
	{
		String ans;
		Scanner sc=new Scanner(System.in);
		Map<Employee,Employee> map=new HashMap<Employee,Employee>();
	
        do
		{
			System.out.println("1.ADD");
			System.out.println("2.DISPLAY");
			System.out.println("3.SEARCH");
			System.out.println("4.SORT");
     	System.out.println("Enter Your Choice");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			
			System.out.println("enter id to be entered");
			Integer id=sc.nextInt();
			System.out.println("enter name ");
			String name=sc.next();
			System.out.println("enter age ");
			int age=sc.nextInt();
			System.out.println("enter sallary ");
			Double sallary=sc.nextDouble();
			Employee emp1=new Employee(name,id,age,sallary);
			map.put(emp1, emp1);
			
			break;
		case 2:
			  for (Map.Entry<Employee,Employee> key :map.entrySet()) 
				{
					 Employee emp=(Employee)key.getValue();
					 System.out.println(emp.getName()+" "+emp.getId()+" "+emp.getAge()+" "+emp.getSal());
			    }
			break;
		case 3:
			System.out.println("enter id to be searched");
			Integer id1=sc.nextInt();
			System.out.println("enter name to be searched");
			String name1=sc.next();
		    Employee e = new Employee(name1,id1,null,null);
			Employee temp = map.get(e);
		    System.out.println("Employee Present " +temp.getId() +" "+ temp.getName()+" "+ temp.getSal()+" "+ temp.getAge());
			
			break;
		case 4:
		/*	List<Employee> list =new ArrayList<Employee>(map.values());
		    Collections.sort(list);
		    Iterator iter = list.iterator();
		    while (iter.hasNext()) 
		    {
		        Employee emp=(Employee)iter.next();
		      System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSal()+" "+emp.getAge());
		    }  
		    
		*/
			Sort(map);
		
		    break;
		}
	   System.out.println("Do you want to Continue");
		ans=sc.next();
	}while(ans.equals("y")||ans.equals("Y"));
	 
	}
	

}
