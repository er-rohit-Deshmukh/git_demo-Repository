package com.capgemini.labs_1;

import java.util.Scanner;

public class SumOfDigits_Cubes_Num
{

	public static void main(String[] args)
	{
	  @SuppressWarnings("resource")
	Scanner sc= new Scanner (System.in);
	  System.out.println("enter a number");
	  
	  int num = sc.nextInt();
	  
       System.out.println(sumCube(num));
	}
	
	public static int sumCube(int num) 
	{
		int sum=0;
		while(num!=0) 
		{
			int rem = num%10;
			sum=sum+cube(rem);
			num=num/10;
		}
		return sum;
	}
  
	public static int cube(int rem)
	{
         int cubDigit=(rem*rem*rem);
          return cubDigit;

	}
	
}
