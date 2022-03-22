package org.zerock.myapp.package4;

public class ChildEx {

	public static void main(String[] args) {
		Parent parent = new Child();
		
		
		//다형성 1에의해 ㄹ부모타입에 선언된 필드와 메소드만 사용가능
		parent.field1 = "data1";	//부모필드사
		parent.method1();			//부모메소드 사용
		parent.method2();			//부모메소드 사용
		
		
//		parent.field2 = "ddd";
//		parent.method3();
		
		
		//다형성-1에 의해 부모타입의 참조변수에 저장된 자식객체를 다시 끄집어낸다.
		//강제형변환 필요
		Child child = (Child) parent;		//이때에는 강제형변환의 부작용이 없다.
		child.field2 = "yyy";
		child.method3();
	}

}
