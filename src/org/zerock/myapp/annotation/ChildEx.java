package org.zerock.myapp.annotation;

public class ChildEx {

	public static void main(String[] args) {

		Child child = new Child();		//자식객체 생성
		
		Parent parent = child;			//다형성-1
		
		
		parent.method1();				//부모타입에 선언된 메소드 호출
		
		//다형성2가 나온다
		parent.method2();				//부모타입에 선언된 메소드 호출
		
		//parent.method3();		//호출불가능		
	}

}
