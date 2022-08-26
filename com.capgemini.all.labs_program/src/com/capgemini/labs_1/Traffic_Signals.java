package com.capgemini.labs_1;
import java.util.Scanner;
public class Traffic_Signals {

	public static void main(String[] args)
	{
		
      System.out.println("1.red");
      System.out.println("2.yellow");
      System.out.println("3.green");
     Scanner sc = new Scanner (System.in);
     
     int choice =sc.nextInt();
       
     
      switch(choice)
      {
      case 1:{
      System.out.println("stop");
       break;
      }  
      case 2:{
    	  System.out.println("ready");
    	  break;
      }
      case 3:{
    	  System.out.println("go");
    	  break;
      }
      default :
    	  System.out.println("choice correct option");
      
      }
      
    		  
		

	}

	private static int nextInt() {
		// TODO Auto-generated method stub
		return 0;
	}
}
