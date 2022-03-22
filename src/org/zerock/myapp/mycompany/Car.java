package org.zerock.myapp.mycompany;


public class Car {
	
	private int speed;
	private boolean stop;
	
//	생성자 : 기본 생성자를 의존	
	
	//메소드 - 기능/행위 구현
	public int getSpeed() { //필드의 값을 반환 
		return speed;
	} //getSpeed
	
	
	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
			return;
		}else {
			this.speed = speed ;
		}
	}//setSpeed
	
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
	
}
