package com.pack;
public class StringManipulation2 
{
public void Manipulation(String name)
{
	int count=0;
	for(int i=0;i<name.length();i++)
	{
	if(name.charAt(i)==' '||name.charAt(i)=='?'||name.charAt(i)==','||name.charAt(i)=='\''||name.charAt(i)==' ')
	{
		count++;
		System.out.println();
	}
	
	}
	System.out.println(count);
	try
	{
	for(int i=0;i<=name.length();i++)
	{
    if(name.charAt(i)==' '||name.charAt(i)=='?'||name.charAt(i)==','||name.charAt(i)=='\''||name.charAt(i)==' ')
	{
	System.out.println();
	}
	else
    {
	System.out.print(name.charAt(i));
	}
	}
	}
	catch(Exception e)
	{
		
	}
	
    }
	public static void main(String[] args) 
	{
		String s="He is a very very good boy,isn't he?";
	    StringManipulation2 man=new StringManipulation2();
	    man.Manipulation(s);

    }
}
