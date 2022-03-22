package org.zerock.myapp.package3;

public class Cat extends Animal{

	public Cat() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("야옹");
	}
	//부모인 추상클래스에 선언된 추상메소드를 반드시 구현해야함
	//만일 자식클래스에서 재정의 하지 않으면 자식클래스 조차 추상 키워드로 추상클래스화 시켜야한다.
	//강제사항인 규격을 지키지 않았기 때문에
	
	
}
