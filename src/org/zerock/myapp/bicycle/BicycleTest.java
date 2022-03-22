package org.zerock.myapp.bicycle;

import lombok.NoArgsConstructor;

@NoArgsConstructor 
public class BicycleTest {

	
	public static void main(String[] args) {
		
		Bicycle bicycle = new Bicycle("삼천리자전거");
		
		System.out.println("자전거 브랜드: " + bicycle.brandName);
		System.out.println("모델명: " + Bicycle.modelName );
		
		
		
		Pedal.pedalRun(); //출발 메소드 호출
		
		bicycle.handle.direction("왼쪽"); //방향 지시 메소드 호출
		
		bicycle.handle.nowBreak(false); //브레이크 지시 메소드 호출
		
		Pedal.pedalStop(); //페달에서 발을 떼면 자전거가 멈춤
		
		
		
		System.out.println("---------------------------------"); //다형성
		System.out.println("");
		
		System.out.println("속도를 높입니다.");
		System.out.println("");
		for(int i = 1 ;i<=10 ; i++) {
			int problemLocation = bicycle.run();
				if (problemLocation == 1) {
					System.out.println("****기어 JavaGear로 교체****");
					System.out.println("");
					bicycle.gear = new JavaGear(100,0); 
				
				}//if
				
		}//for
		
		System.out.println("-----------------------------");
		
	}//main
	
}//end class
