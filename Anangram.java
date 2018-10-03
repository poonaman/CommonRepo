package com.pack;
import java.util.Scanner;
public class Anangram 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String");
		String name1=sc.next();
		System.out.println("Enter Second String");
		String name2=sc.next();
		Anangram ana=new Anangram();
		ana.Anangram(name1,name2);
		
	}
	public void Anangram(String s1,String s2)
	{
		try
		{
		
		int flag1=0,flag2=0;
		int len1=s1.length();
		int len2=s2.length();
		String s3=s1.toLowerCase();
		String s4=s2.toLowerCase();
	char s5 []=s1.toLowerCase().toCharArray();
		char s6[]=s2.toLowerCase().toCharArray();
		
		for(int i=0;i<=len1;i++)
		{
			for(int j=i+1;j<=len1-1;j++)
			{
				if(s5[j-1]>s5[j])
				{
					char temp=s5[j];
					s5[j]=s5[j-1];
					s5[j-1]=temp;
				}
			}
		}
		System.out.println(s5);
		for(int i=0;i<=len1;i++)
		{
			for(int j=i+1;j<=len2-1;j++)
			{
				if(s6[j-1]>s6[j])
				{
					char temp=s6[j];
					s6[j]=s6[j-1];
					s6[j-1]=temp;
				}
			}
		}
		System.out.println(s6);
		if(len1==len2)
		{
		for(int i=0;i<=len1;i++)
		{
			if(s5[i]==s6[i])
			{
				flag1=1;
				break;
			}
			else
			{
				flag1=0;
				break;
			}
		}
		}
		if(flag1==1)
		{
			System.out.println("amargram");
		}
		else
		{
			System.out.println("not");
		}
	   /*System.out.println(s6);
		if(len1==len2)
		{
			for(int i=0;i<len1;i++)
			{
				for(int j=0;j<len1;j++)
				{
					if(s5[i]==s6[j])
					{
						flag1=1;
						break;
					}
					else
					{
						flag1=0;
					}
				}
				if(flag1==0)
				{
					flag2=1;
					break;
				}
			}
		}
		if(flag2==1)
		{
			System.out.println("It is not Anangram");
		}
		else
		{
			System.out.println("It is Anangram");
		}
	*/}
	catch(Exception e)
		{
		
		}
	}
}
