package org.zerock.myapp.bicycle;


public class Pedal {

	//고유필드
	String pedalMaterial; //PVC패달,알루미늄패달,알로이패달,펑페달
	
	//상태필드
	boolean pedalWork;
	
	
	public Pedal (String pedalMaterial) {
		this.pedalMaterial = pedalMaterial;
	}//constructor
	
	
	//메소드
	static void pedalRun() {
		System.out.println("자전거가 출발합니다.");
	} //pedalRun
	
	static void pedalStop() {
		System.out.println("자전거가 멈춥니다."); //자전거가 멈추는 방법: 1.페달을 밟지 않기 2.브레이크
	}//PedalStop
	
	
}//end class
