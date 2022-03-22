package org.zerock.myapp.package6;


public class Car {

	
	//다형성-1 로 필드 초기화 (부품장착)
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire BackLeftTire = new HankookTire();
	Tire BackRightTire = new HankookTire();
	
	
	
	//다형성-2 :부모타입의 메소드 호출, 다형성-1에 의해 대입된 자식객체의 재정의된 메소드가 호출
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		BackLeftTire.roll();
		BackRightTire.roll();
	}
}
