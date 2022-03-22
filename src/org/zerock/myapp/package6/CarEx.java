package org.zerock.myapp.package6;


public class CarEx {

	public static void main (String[] args) {
		
		Car myCar = new Car();
		
		myCar.run();
		
		
		//부품교환
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run();
		
	}
	
}
