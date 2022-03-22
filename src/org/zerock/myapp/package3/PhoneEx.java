package org.zerock.myapp.package3;


public class PhoneEx {

	public static void main (String[]args) {
		
		//추상클래스로부터 객체를 직접 생성할 수 없음
		//-> 실체가 아닌 추상이라서
		Phone phone = new Phone(); 			//인스턴스화 불가능
		
		
		
		
		//자식객체 생성
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		
		//부모클래스로 부터 물려받은 메소드호출
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
	
}
