package com.pack;

public class Employee implements Comparable<Employee>
{
private  String name;
private  Integer id;
private Integer age;
public Double sal;
public Employee() 
{
		// TODO Auto-generated constructor stub
}
public Employee(String name, Integer id, Integer age, Double sal) 
{
	super();
	this.name = name;
	this.id = id;
	this.age = age;
	this.sal = sal;
}

@Override
public int hashCode()
{
	  int hash=0;
      hash = hash  + id.hashCode();
      hash = hash  +  name.hashCode();
      return hash;
}
@Override
public boolean equals(Object obj)
{
	if (!(obj instanceof Employee)) 
	{
        return false;
    }
    Employee other = (Employee) obj;
    return other.id.equals(id)&& other.getName().equals(name);
}
public String getName() 
{
	return name;
}

public void setName(String name) 
{
	this.name = name;
}

public Integer getId() 
{
	return id;
}

public void setId(Integer id) 
{
	this.id = id;
}

public Integer getAge()
{
	return age;
}

public void setAge(Integer age) 
{
	this.age = age;
}

public Double getSal() 
{
	return sal;
}

public void setSal(Double sal) 
{
	this.sal = sal;
}

@Override
public int compareTo(Employee emp) 
{
	if(this.sal==emp.sal)
	{
		return 0; 
	}
		else if(this.sal>emp.sal)  
	{
		return -1;  
	}
		else
	{
		return 1; 
	}
}

}
