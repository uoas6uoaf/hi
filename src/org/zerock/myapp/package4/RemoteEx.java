package org.zerock.myapp.package4;

public class RemoteEx {

	public static void main (String[]args) {
		
		RemoteControl rc = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("turnOn() invoked");
			}

			@Override
			public void turnOff() {
				System.out.println("turnOff() invoked");
			}

			@Override
			public void setVolume(int volume) {
				System.out.println("setvolume() invoked");
			}
			
		};
			
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(RemoteControl.MAX_VOLUME); //정적필드니까 정적필드 방식으로 호출
		
		
	
		
		
	}//main
	
}//end class
