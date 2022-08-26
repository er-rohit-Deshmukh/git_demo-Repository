package com.capgemini.labs_1;
import java.util.Scanner;
import java.util.Scanner;
public class CheckIncreasingOrder {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter a number");
		int num =sc.nextInt();
		boolean b = checkNumber(num);
	    
		if(b==true) 
		{
		  System.out.println(num+" number is an increasing order");	
		}
		else
		{
			System.out.println(num+" number is not an increasing order");			
		}
		
		
	}
   public static boolean checkNumber(int num)
   {
	   int currentDigit =num%10 ;
	   num = num/10 ;
	   
	   while(num>0)
	   {
		   if(currentDigit <= num % 10)
		   {
			  return false ; 
			}
		   int currentDigit1 =num%10 ;
		   num = num/10 ;

	   }
	   return true;
   }
} 
