public class BicycleTest {

	public static void main(String[] args) {
		//자전거의 기본적인 정보 (전달인자값: 모델명,브랜드명,전체무게)
		Bicycle b1BasicInfo = new Bicycle("6조","삼천리자전거");
			System.out.println("모델명: " + b1BasicInfo.modelName);
			System.out.println("브랜드명: " + b1BasicInfo.brandName );
			System.out.println("전체무게: " + b1BasicInfo.weight + "kg");
			System.out.println("");
			
			
		//자전거 프레임 정보 (전달인자값: 프레임 재질, 프레임 무게)
		Frame frameInfo = new Frame ("알루미늄","검정"); 
			
			System.out.println("-------프레임 정보-------");
			System.out.println("프레임 재질은 " + frameInfo.material + " 입니다.");
			System.out.println("프레임 색상은 " + frameInfo.frameColor  + "색입니다.");
			System.out.println("");
			
		//자전거 안장 정보 (전달인자값: 용도,색상)
		Seat seatInfo = new Seat("산악용","검정");//type:"크로스컨트리용","올마운틴용","로드용"
			
			System.out.println("-------안장 정보-------");
			System.out.println("안장 종류는 " + seatInfo.seatType + " 입니다.");
			System.out.println("안장 색상은 " + seatInfo.seatColor + "색입니다.");
			System.out.println("");
			
		//자전거 페달 정보 (전달인자값 : 페달 재질, 색상)
		Pedal pedalInfo = new Pedal("알루미늄","파랑");//Material:PVC,알루미늄,알로이,펑
			
			System.out.println("-------페달 정보-------");
			System.out.println("페달 재질은 "+ pedalInfo.pedalMaterial + "입니다.");
			System.out.println("페달 색상은 " + pedalInfo.pedalColor +"색입니다.");
			System.out.println("");
			
		//자전거 바퀴 정보 (전달인자값 : 바퀴 사이즈,갯수)
		Wheels wheelsInfo = new Wheels (26,4);
		
			System.out.println("-------바퀴 정보-------");
			System.out.println("바퀴 inch는 " + wheelsInfo.inch + " inch 입니다.");
			System.out.println("바퀴 개수는 " + wheelsInfo.ea + "개 입니다.");
			System.out.println("");
			
		//자전거 핸들 정보(전달인자값: 핸들 색상, 기어 단수)
		Handle handleInfo = new Handle ("검정",7);
			
			System.out.println("-------바퀴 정보-------");
			System.out.println("핸들 색상은 " + handleInfo.handleColor + "색입니다.");
			System.out.println("기어 단수는 " + handleInfo.gearLevel + "단 입니다.");
			System.out.println("");
		

			
			
//			----------메소드호출------------
			Bicycle mybicycle = new Bicycle ("6조","삼천리자전거",false,"straight");
			
			Bicycle.getOn();// 탑승 메소드 호출

			mybicycle.setPedal(false); //페달을 밟음 -> 자전거가 사용자의 힘을 받고 움직일 수 있다. 밟음->true , 밟지않음 ->false
			
			boolean move = mybicycle.moveBi();
			if(move == true) {
				System.out.println("자전거가 출발합니다.");
			}else {
				System.out.println("이제 자전거가 멈춥니다.");
			}
			
//			핸들방향 메소드 호출하기
//			;;
			
			
			Bicycle.getOff(); // 자전거에서 내려오는 메소드 호출
			
			
		
			
			
			
	}//main

}//end class
