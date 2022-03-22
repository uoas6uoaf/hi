package org.zerock.myapp.package4;

import org.zerock.myapp.package3.RemoteControl;

public class SmartTv implements org.zerock.myapp.package4.RemoteControl, Searchable {
	
	private int volume;
	
	@Override 
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
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
		
		System.out.println("현재 TV 볼륨 : " + volume );
		
	}


	//두번째 인터페이스인 Searchable에 선언된 추상메소드 재정의
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}
		
}
