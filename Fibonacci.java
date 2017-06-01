package com;

import java.util.Scanner;

public class Fibonacci {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,num1=0,num2=1;
		System.out.println("Enter the limit for fibonacci series");
		int count=sc.nextInt();
		
		System.out.println("Fibonacci Series");
		System.out.println(num1+"\n"+num2);
		for(int i=num1;i<=count;i++)
		{
			num=num1+num2;
			System.out.println(num);
			num1=num2;
			num2=num;
		}
	}
}
