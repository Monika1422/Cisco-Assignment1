package com;

//Method Overloading
class  Base{
	void methodA(int num) 
	  {
		 System.out.println ("methodA:" + num);  
	  }
	void methodA(int num1, int num2)
	  {
		System.out.println ("methodA:" + num1 + "," + num2);
	  }
	double methodA(double num) {
		System.out.println("methodA:" + num);     
	   return num;
	}
	 void display()
	 {
		 System.out.println("This is base class method");
	 }
	}
//Method overriding
    class OverridingDemo extends Base
    {
    	void display()
    	 {
    		System.out.println("This is method of OverridingDemo");
    	 }
    }

public class PolymorphismEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Base Obj = new Base();
	       Base Obj2=new OverridingDemo();
	       double result;
	       Obj.methodA(20);
	       Obj.methodA(20, 30);
	       result = Obj.methodA(5.5);
	       System.out.println("Answer is:" + result);
	       Obj.display();
	       Obj2.display();
		

	}

}
