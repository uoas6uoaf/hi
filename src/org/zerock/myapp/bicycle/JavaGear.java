package org.zerock.myapp.bicycle;

public class JavaGear extends Gear {

	public JavaGear(int maxSpeed , int speed) {
		super (maxSpeed ,speed);
	}
	
	@Override
	public boolean gearOn () {
		speed += 10 ;
		
		if (speed < maxSpeed) {
	
			System.out.println(" 현재속도: " + speed + "km/h");
			return true;
		}else {
			System.out.println("기어 교체가 필요합니다.");
			return false;
		}//if-else
		
	}//gearOn
	
}//end class
