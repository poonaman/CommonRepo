package com.pack;

import java.util.Scanner;

public class HealthyBurger extends Hamburger 
{
	private double cheese;
	private double panner;
	int f1=0;
	int f2=0;
	public HealthyBurger() 
	{
		// TODO Auto-generated constructor stub
	}
	public HealthyBurger(double cheese, double panner) {
		//super(name,rollType,meat,price,tomato,carrot);
		this.cheese = cheese;
		this.panner = panner;
	}
	public double Bill()
	{
		System.out.println("Select Your Toffings of HealthyHamburger");
		System.out.println("1.Cheese");
		System.out.println("2.Panner");
		System.out.println("Do you wanat extra Cheese y/n");
		Scanner sc=new Scanner(System.in);
	    String ans=sc.next();
	    double priceOfBurger=0;
	    if(ans.equals("y")||ans.equals("Y"))
	    {
	    	f1=1;
	    	System.out.println("f1"+f1);
	    }
	    System.out.println("Do you wanat extra Panner y/n");
		
	    String ans1=sc.next();
	    if(ans1.equals("y")||ans1.equals("Y"))
	    {
	    	f2=1;
	    	System.out.println("f2"+f2);
	    }
	  
	    if(f1==1&&f2==1)
	    {
	    	priceOfBurger=cheese+panner;
	    }
	    if(f1==1&&f2==0)
	    {
	    	priceOfBurger=cheese;
	    }
	    if(f1==0&&f2==1)
	    {
	    	priceOfBurger=panner;
	    }
	    if(f1==0&&f2==0)
	    {
	    	priceOfBurger=0;
	    }
	
	    return priceOfBurger;
	}
    
}
