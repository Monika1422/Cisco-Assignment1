package com;

class vehicle {
	private String color;
	private int speed;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
class Car extends vehicle
 {
	int CC;
	int gears;
	void CarAttributes()
	{
		System.out.println("Color of Car :" +getColor());
		System.out.println("Speed of Car :"+getSpeed());
		System.out.println("CC of Car : "+CC);
		System.out.println("No of gears  :"+gears);
	}	
 }
public class EncapsuInherit {
	public static void main(String[] args) {
    Car Obj=new Car();
    Obj.setColor("blue");
    Obj.CC=1000;
    Obj.gears=5;
    Obj.setSpeed(150);
    Obj.CarAttributes();
    
}
}