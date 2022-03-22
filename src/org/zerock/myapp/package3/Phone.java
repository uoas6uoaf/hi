package org.zerock.myapp.package3;

public abstract class Phone {

	//필드
	public String owner;
	
	
	//생성자
	public Phone (String owner) {
		this.owner = owner;
	}//자식객체를 생성하기 위해 초기화할 수 있는 생성자는 가능하다.
	
	
	//공통메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
	
} // end class
