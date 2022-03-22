package org.zerock.myapp.package3;


public class Dog extends Animal{

	public Dog() {
		this.kind ="포유류";//정석
		super.kind = "포유류";//초기화가 아닌 값을 바꾼것.부모클래스의 생성자선언이 없음
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
