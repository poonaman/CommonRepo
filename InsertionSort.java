package com.pack;

public class InsertionSort
{
	public void Insertion(int [] array)
	{
		for(int j=1;j<array.length;j++)
		{
			int key=array[j];
			int i=j-1;
			while((i>=0)&&(array[i]>key))
			{
				array[i+1]=array[i];
				i=i-1;
				array[i+1]=key;
			}
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Enter No of Elements you want");
		int [] array= {10,20,30,90,1,3,5};
		InsertionSort sort=new InsertionSort();
		sort.Insertion(array);
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	}
}