package org.zerock.myapp.package3;

import lombok.ToString;

@ToString  //객체를 출력했을때 참조를 찍는게 아니라 필드의 현재상태와 타입정보 내부상태를 보기쉽게 출력
public class Audio implements RemoteControl {
	
	//필드
	private int volume;
	
//	인터페이스의 규격을 규현
//	2.turnOn 추상메소드의 실체 메소드
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	
	
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	
//	2.setVolume추상 메소드의 실체 메소드
	@Override 
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume <RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}//if-else
		
		System.out.println("현재 Audio 볼륨 : " + volume );
		
	}//setVolume
	
	
}
