package com.pack;
public class StringAssig
{
	public static void main(String[] args)
	{
		String name = "sd#%gt%$&dfsd";
		char[] name15 = name.toCharArray();
		int j = 0;
		for (int i = 0; i < name.length(); i++) 
		{
			if (Character.isLetter(name.charAt(i))) 
			{
              j++;
            }
		}
		int k = 0;
		char[] arr = new char[j];
		for (int i = 0; i < name.length(); i++) 
		{
			if (Character.isLetter(name.charAt(i))) 
			{
				arr[k] = name.charAt(i);
				k++;
		    }
		}

		String name30 = String.valueOf(arr);
		StringBuilder builder = new StringBuilder(name30);
		System.out.println(builder);
		StringBuilder name10 = builder.reverse();
		String name31=name10.toString();
		char arr3[]=name31.toCharArray();
		int m=0;
		int n=0;
		for(m=0,n=0;m<name15.length;m++)
		{
			if (Character.isLetter(name15[m]))
					{
				     name15[m]=arr3[n];
				     n++;
					}
		}
		System.out.println(name15);
	}
}
