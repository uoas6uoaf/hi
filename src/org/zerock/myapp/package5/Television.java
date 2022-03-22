package org.zerock.myapp.package5;

public class Television implements RemoteControl  {

		//필드
		private int volume;
		
//		인터페이스의 규격을 규현
//		2.turnOn 추상메소드의 실체 메소드
		@Override 
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		
		
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
		
//		2.setVolume추상 메소드의 실체 메소드
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
			
		}//setVolume


		
		//default  재정의
		
		@Override
		public void setMute(boolean mute) {

			System.out.println("Television::setMute()invoked.");
			
		}
}
