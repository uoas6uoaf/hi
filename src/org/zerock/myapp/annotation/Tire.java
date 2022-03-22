package org.zerock.myapp.annotation;


public class Tire {

	//고유속성
	public int maxRotation;				//최대 회전수
	public String location;				//타이어의 위치
	
	//상태필드
	public int accumulatedRotation;		//누적회전수
	
	//생성자
	public Tire (String location , int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	
	public boolean roll() {
		++accumulatedRotation;
		
		if (accumulatedRotation < maxRotation ) {
			System.out.println(location + "Tire 수명 : " + (maxRotation - accumulatedRotation ) + "회");
			
			return true;
		}else {
			System.out.println("***" + location + " Tire 펑크 ***");
			
			return false;
		}
	}
	
}
