package org.zerock.myapp.package2;

public class Car {

	//상태필드
	public int speed;
	
	//인스턴스메소드
	public void speedUp() {
		speed += 1;
	}
	
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
	
}
