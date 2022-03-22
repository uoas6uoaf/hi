package org.zerock.myapp.package3;

public class InstanceOfEx {

	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - child 로 변환 성공");
			
		}else {
			System.out.println("method 1- child로 변환되지 않음");
		}
	}
	
	
	public static void method2 (Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - child로 변환성공");
	} 
	
	public static void main (String [] args) {
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
	}
	
}
