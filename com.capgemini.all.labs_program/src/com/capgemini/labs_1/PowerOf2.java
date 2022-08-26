package com.capgemini.labs_1;

import java.util.Scanner;

public class PowerOf2
{
	public static void main(String[] args)
	{
	 Scanner sc =new Scanner(System.in);
	 System.out.println("Enter a number");
	 int a=sc.nextInt();
	 boolean b=checkNumber(a);
	 
	  if(b==true)
	  {
		System.out.println(a+"is power of 2");  
	  }
	  else
	  {
		System.out.println(a+  " is not power of 2");
	  }
	 
	}
	public static boolean checkNumber(int n)
	{    
		while (n%2==0) 
		{
			n=n/2;
		}
		if(n==1)
		{
			return true;
		}
		else
		{
			return false;
		}
     }	 


}
