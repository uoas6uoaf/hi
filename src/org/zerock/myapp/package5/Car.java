package org.zerock.myapp.package5;


public class Car {
	
	private int speed;
	private boolean stop;
	
	
	//생성자 - 기본 생성자를 의존
	
	//메소드 - 기능 / 행위 구현
	//1.getter는 왜 필요한가? - 필드의 값을 변환해서 줘야할 경우가 많음
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed (int speed) {
		if (speed < 0) {
			this.speed = 0;
			return;
		}else {
			this.speed = speed;
		}
	}
	
	//3. boolean 타입의 필드에 대한 getter 이름은 is필드명 으로 정한다.
	public boolean isStop() {
		return stop;
	}
	
	
	public void setStop (boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
