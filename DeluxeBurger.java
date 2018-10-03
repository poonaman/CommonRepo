package com.pack;

import java.util.Scanner;

public class DeluxeBurger extends Hamburger
{
 private double chips;
 private double coke;
 int f1=0;
 int f2=0;
 public DeluxeBurger() {
	// TODO Auto-generated constructor stub
}
public DeluxeBurger(double chips, double coke) {
	super();
	this.chips = chips;
	this.coke = coke;
}
public double Bill()
{
	System.out.println("Select Your Toffings of Deluxeburger");
	System.out.println("1.Chips");
	System.out.println("2.Coke");
	System.out.println("Do you want Chips y/n");
	Scanner sc=new Scanner(System.in);
    String ans=sc.next();
    double priceOfBurger=0;
    if(ans.equals("y")||ans.equals("Y"))
    {
    	f1=1;
    	System.out.println("f1"+f1);
    }
    System.out.println("Do you want Coke y/n");
	
    String ans1=sc.next();
    if(ans1.equals("y")||ans1.equals("Y"))
    {
    	f2=1;
    	System.out.println("f2"+f2);
    }
  
    if(f1==1&&f2==1)
    {
    	priceOfBurger=chips+coke;
    }
    if(f1==1&&f2==0)
    {
    	priceOfBurger=chips;
    }
    if(f1==0&&f2==1)
    {
    	priceOfBurger=coke;
    }
    if(f1==0&&f2==0)
    {
    	priceOfBurger=0;
    }
    return priceOfBurger;
}
}
