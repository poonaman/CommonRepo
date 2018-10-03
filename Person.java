package com.pack;

public class Person implements Comparable<Person>
{
	private String name;
	private Integer age;
	public Person() 
	{
		// TODO Auto-generated constructor stub
	}
	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public int compareTo(Person p)
	{
		if(this.age==p.age)
		{
			return 0; 
		}
			else if(this.age>p.age)  
		{
			return -1;  
		}
			else
		{
			return 1; 
		}
	}
	

}
