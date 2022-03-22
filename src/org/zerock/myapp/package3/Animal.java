package org.zerock.myapp.package3;


//추상클래스를 통해 적어도 동물이라면 반드시 가져야할 속성과 기능을 필드와 메소드로 선언하여
//아룰 '규격화'해서 상속 받는 자식 클래스가 반드시 이 규격을 지키도록 해줌
public abstract class Animal {

	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	
	//메소드의 시그니처만 있고 구현부{} 가 없음
	//이 추상 클래스를 상속받는 모든 자식 클래스에서는 이 추상 메소드를 반드시 구현(재정의,오버라이딩)
	//해야함 만일 구현하지안흐면 해당 자식클래스조차 추상클래스가 되어야함
	public abstract void sound();
}
