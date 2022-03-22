package org.zerock.myapp.package3;


public class RemoteEX {

	
	public static void main (String[] args) {
		RemoteControl rc;				//부모타입
		
		rc = new Television(); 			//다형성-1
		System.out.println("rc1: " + rc);
		
		rc.turnOn();					//다형성- 2
		rc.turnOff();					//다형성-2
		
		rc = new Audio();				//다형성-1
		System.out.println("rc2: " + rc);
		
		rc.turnOn();					//다형성-2
		rc.turnOff();					//다형성-2
		
		RemoteControl.changeBattery();
		
		
	}//main
	
}//end class
