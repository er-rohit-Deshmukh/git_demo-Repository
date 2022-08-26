package com.capgemini.labs_1;
import java.util.Scanner;
public class SumDifferenceNumber {

	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner (System.in);
	  
	  System.out.println("Enter a Number");
	  int num=sc.nextInt();
	   System.out.println(calulateDifference( num));

	}
    public static int calulateDifference( int num)
    {   int total=0; 
        int sumsq=0;
	  for(int i=1;i<=num;i++) 
	  {
	    total+=(i*i);
	    sumsq+=i;	  
	  }
	  int sum = (sumsq*sumsq)-total;
	  return sum;
    }
  
}
