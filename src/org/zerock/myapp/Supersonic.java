package org.zerock.myapp;


public class Supersonic extends Airplane {
	//불변의 진리값 선언 : 공요으로 사용
	public static final int NOMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NOMAL;
	
	
	@Override
	public void fly() {
		if (flyMode == SUPERSONIC ) {
			System.out.println("초음속 비행합니다.");
		}else {
			super.fly(); 
		}
	}

	
	
}
