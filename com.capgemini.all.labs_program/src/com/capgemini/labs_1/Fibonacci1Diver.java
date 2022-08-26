package com.capgemini.labs_1;

import java.io.*;
import java.lang.*;

public class Fibonacci1Diver extends Fibonacci1
{

	public static void main(String[] args) throws IOException
	{
	  InputSteamReader obj= new InputSteamReader(System.in);
	  
	  BufferedReader br= new BufferedReader(obj);
	  
	  System.out.print("Enter a Value of n");
	  
	  int n = Integer.parsetInt(br.ReadLine());
	  
	  Fibonacci1 ob = new Fibonacci1();
	  
	  System.out.println("Fibonacci Series is:");
	  
	  int res =0;
	  for(int i=1;i<=n;i++)
	  {
		  res=ob.Fibonacci1(i);
		  System.out.println(" "+res);
		  
	  }
	  
	  System.out.println();
	  
	  System.out.print(n+"th number of the series is:"+res);	
	}

}
