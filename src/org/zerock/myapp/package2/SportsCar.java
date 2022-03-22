package org.zerock.myapp.package2;

public class SportsCar extends Car {

	@Override
	public void speedUp() {
		speed += 10;
	}
	
//	@override				오버라이딩을 할 수 없음
//	public void stop() {
//		speed = 0;
//	}
}
