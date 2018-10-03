package com.pack;

import java.util.Scanner;

public class Hamburger 
{
	private String name;
	private String rollType;
	private String meat;
    private double price;
    private double tomato;
    private double carrot;
    int f1=0;
    int f2=0;
public Hamburger()
{
	
}
public Hamburger(String name,String rollType, String meat, double price,double tomato,double carrot) 
{
	super();
	this.name=name;
	this.rollType = rollType;
	this.meat = meat;
	this.price = price;
	this.carrot=carrot;
	this.tomato=tomato;
}
public double Bill()
{
	System.out.println("Select Your Toffings of Hamburger");
	System.out.println("1.Tomato");
	System.out.println("2.Carrot");
	System.out.println("Do you wanat extra tomato y/n");
	Scanner sc=new Scanner(System.in);
    String ans=sc.next();
    double priceOfBurger=0;
    if(ans.equals("y")||ans.equals("Y"))
    {
    	f1=1;
    	System.out.println("f1"+f1);
    }
    System.out.println("Do you wanat extra carrot y/n");
	
    String ans1=sc.next();
    if(ans1.equals("y")||ans1.equals("Y"))
    {
    	f2=1;
    	System.out.println("f2"+f2);
    }
  
    if(f1==1&&f2==1)
    {
    	priceOfBurger=price+tomato+carrot;
    }
    if(f1==1&&f2==0)
    {
    	priceOfBurger=price+tomato;
    }
    if(f1==0&&f2==1)
    {
    	priceOfBurger=price+carrot;
    }
    if(f1==0&&f2==0)
    {
    	priceOfBurger=price;
    }
    return priceOfBurger;
}
}