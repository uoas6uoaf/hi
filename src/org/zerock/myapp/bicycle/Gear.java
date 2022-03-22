package org.zerock.myapp.bicycle;


public class Gear {
	
	//고유필드
	public static int maxSpeed;
	public int speed;
	
	
	public Gear(int maxSpeed ,int speed) {
		this.maxSpeed = maxSpeed;
		this.speed = speed;
	}//constructor
	
	
	//메소드
	public boolean gearOn () {
		
		speed += 10 ;
		
		System.out.println(" 현재속도:  " + speed + "km/h");
		
		if (speed < maxSpeed) {
			return true;
		}else {
			System.out.println("기어 교체가 필요합니다.");
			return false;
		}//if-else
		
	}//gearOn
	
}//end class
