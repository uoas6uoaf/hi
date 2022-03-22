package org.zerock.myapp.package4;


//1.인터페이스에 선언할 수 있는 첫번째 멤버로, static final 상수 선언
public interface RemoteControl {

//	1.상수멤버
	//컴파일러가 알아서 public static final 을 추가함
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	
	//컴파일러가 알아서 public abstract을 알아서 추가한다
	//위의 경우도 포함아여 컴파일러가 자동 생성해주는것을 의지하지 말것
//	2.추상메소드(강제규격) - 자식객체가 반드시 구현해야할 기능을 선언
	public abstract void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	
	//----자바8부터 가능
	//디폴트 메소드 (완전한 인스턴스 메소드이다!) ->객체없이는 사용불가
	//각 객체마다 다르개 줄 수 있는 성질
	//각 객체가 자기가 원래 가지고 있는 것처럼 
	public default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다");
		}else {
			System.out.println("무음 해제합니다.");
		}//if-else
		
	}//setMute
	
	//정적메소드
	//이 메소드를 호출한 자식 클래스만 건전지를 교환한다.
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}//changeBattery
	
	
	
}//end interface
