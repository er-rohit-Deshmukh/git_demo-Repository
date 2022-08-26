package com.capgemini.labs_1;

//non recursive solution
import java.util.Scanner;        
public class Fibonacci {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int a=1,b=1,c=0,n;
		
        System.out.print("enter Value of n ");
        n=sc.nextInt();
        
        System.out.print(a);
        
        System.out.print(" "+b);
        
        for(int i=0;i<n-2;i++)
        {
          c=a+b;
          
          a=b;
          
          b=c;
          
          System.out.print(" "+c);
        }
        System.out.println();
        
        System.out.print(n+"th number of the series is:"+c);
        
        
	}

}
