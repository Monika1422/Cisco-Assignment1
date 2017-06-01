package com;

import java.util.Scanner;

public class SumOfDigits {
	static Scanner sc=new Scanner(System.in); 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,rem,sumOf=0;
        System.out.println("Enter any digit");
        num=sc.nextInt();
		while(num>0)
		{
			rem=num%10;
			sumOf=sumOf+rem;
			num=num/10;
		}
		System.out.println("Sum of digit : "+sumOf);
	}
}
