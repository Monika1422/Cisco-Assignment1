package com;

interface Addition
 {
	public int add(int a,int b);
}
interface Subtraction
{
	public int subtract(int a,int b);
	}
class Multiplication implements Addition,Subtraction
{
	@Override
	public int add(int a, int b) {
		return a+b;
	}
	public int subtract(int a, int b) {
	    return a-b;
	}	
	public int multiplication(int a,int b)
	{
		return a*b;
	}
	}
public class MultipleInheritance {
   public static void main(String[] args) {
		Multiplication Obj=new Multiplication();
		System.out.println("Addition : "+Obj.add(4, 5));
		System.out.println("Subtraction :" +Obj.subtract(5, 1));
		System.out.println("Multiplication :" +Obj.multiplication(2, 4));
    }
}
