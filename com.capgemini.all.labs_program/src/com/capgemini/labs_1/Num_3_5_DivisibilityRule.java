package com.capgemini.labs_1;

import java.util.Scanner;

public class Num_3_5_DivisibilityRule 
{
   public static void main(String[] args) 
   {
	Scanner sc =new Scanner(System.in);
    System.out.println("Enter a Number");
    
    int num  =sc.nextInt();
  System.out.println (calculateSum(num));
   }
   
   public static int calculateSum(int num)
   {
	   int sum =0;
	  for(int i=1;i<=num;i++) 
	  {
	   
	   if(i%3==0 && i%5==0)
	   {
		   sum=sum+i;
	   }
   }
	return sum;
	
  }
}