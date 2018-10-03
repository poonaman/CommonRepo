package com.pack;

import java.util.Scanner;

public class MainApp
{
	public static void main(String[] args) 
	{
		String ans;
		do
		{
		System.out.println("Enter which burger you want");
		System.out.println("1.Hamburger");
		System.out.println("2.HealthyBurger");
		System.out.println("3.DeluxeBurger");
		int ch;
		
		Scanner sc=new Scanner(System.in);
		ch=sc.nextInt();
		
		Hamburger ham1=new Hamburger("Healthy","non-veg","yes",200,20,30);
		switch(ch)
		{
		case 1:
			
			System.out.println(ham1.Bill());
			break;
		case 2:
			Hamburger ham=new HealthyBurger(50,60);
			double price=ham1.Bill()+ham.Bill();
			System.out.println(price);
			break;
		case 3:
			Hamburger ham2=new DeluxeBurger(10,20);
			double priceOfBurger=ham1.Bill()+ham2.Bill();
			System.out.println(priceOfBurger);
			break;
			
		}
		System.out.println("Do you want to continue");
		ans=sc.next();
		}while(ans.equals("y")||ans.equals("Y"));
	}
     

}
