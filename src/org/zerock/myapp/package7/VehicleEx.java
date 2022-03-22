package org.zerock.myapp.package7;


public class VehicleEx {

	public static void main (String [] args) {
		Vehicle vehicle = new Bus(); //다형성 -1
		
		vehicle.run();				//다형성-2
//		vehicle.checkFare();		//인터페이스의 멤버가 아니다. 부모만 보이기 때문에 
									//부모타입에 선언된 멤버만 보인다.
		
		
		if ( vehicle instanceof Bus bus) {
//			Bus bus = (Bus) vehicle;
			bus.run();
		bus.checkFare();
			
		}//if
		
		//자식객체만 가지고 있는 메소드를 끌어낼 때는 강제타입변환 필요
		
		
	}
	
}
