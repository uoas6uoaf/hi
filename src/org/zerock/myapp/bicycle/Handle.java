package org.zerock.myapp.bicycle;


public class Handle {
	
	int gearLevel;
	boolean breaklever;
	String handleLocation;
	
	public Handle (int gearLevel) {
		
		this.gearLevel = gearLevel;
		
	}//생성자 선언
	
	
	//메소드
	void direction (String handleLocation) {
		
		String result = handleLocation;
		
		if (result == "왼쪽") {
			System.out.println("왼쪽으로 갑니다.");
		} else if (result == "오른쪽") {
			System.out.println("오른쪽으로 갑니다.");
		} else if(result =="직진"){
			System.out.println("직진합니다.");
		} //if-else
		
	}//direction method
	
	public boolean nowBreak (boolean breakLever) {
			
		if (breakLever == true) {
			System.out.println("브레이크를 당겼습니다");
			System.out.println("멈춥니다.");
			return true;
		}else {
			System.out.println("자전거가 계속 달립니다.");
			return false;
			}//if-else
		
	}//nowBreak
	
	
}//end class
