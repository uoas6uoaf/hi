 package org.zerock.myapp.annotation;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Car {

	//부품필드(집합관계)
	Tire frontLeftTire = new Tire ("앞왼쪽",6);
	Tire frontrightTire = new Tire ("앞오른쪽",2);
	Tire backLeftTire = new Tire ("뒤왼쪽",3);
	Tire backRightTire = new Tire ("뒤오른쪽",4);
	
	//생성자
	
	//매소드
	int run() {
		System.out.println("[자동차가 달립니다.]");
		
		if(frontLeftTire.roll() == false) { stop(); return 1;}
		if(frontrightTire.roll() == false) { stop(); return 2;}
		if(backLeftTire.roll() == false) { stop(); return 3;}
		if(backRightTire.roll() == false) { stop(); return 4;}
		
		return 0;
		
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
	
}
