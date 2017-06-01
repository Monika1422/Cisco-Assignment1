package com;

public class Pattern {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=7;i++)
		{
			for(j=1;j<=i;j++)
				System.out.print(j);
			    System.out.println();
		}
		for(i=i-2;i>=1;i--)
		{
			for(j=1;j<=i;j++)
				System.out.print(j);
			    System.out.println();
		}
	}
}
