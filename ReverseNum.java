package com;

import java.util.Scanner;

public class ReverseNum {
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  int num,rem,rev=0;
	  System.out.println("Enter any digit");
	  num=sc.nextInt();
	  while(num>0)
	  {
		  rem=num%10;
		  rev=rev*10+rem;
		  num=num/10;
	  }
	  System.out.println("Reverse number="+rev);
	  

	}

}
