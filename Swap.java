package com;
import java.util.Scanner;
public class Swap {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1,no2;
		System.out.println("Enter any two number");
		no1=sc.nextInt();
		no2=sc.nextInt();
		System.out.println("Number1 : "+no1+"\n"+"Number2 : "+no2);
		System.out.println("After Swap");
		no1=no1+no2;
		no2=no1-no2;
		no1=no1-no2;
		System.out.println("Number1 : "+no1+"\n"+"Number2 : "+no2);
	}
}	

	