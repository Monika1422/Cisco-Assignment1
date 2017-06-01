package com;

import java.util.Scanner;
public class PrimeNo {
	static Scanner sc=new Scanner(System.in);
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		System.out.println("Enter any number");
		int num=sc.nextInt();
		
		for(i=2;i<num;i++)
		{
			if(num%i==0)
				break;
		}
		if(i==num)
			System.out.println("Number is prime");
		else 
			System.out.println("Number is not prime");
		

	}

}
