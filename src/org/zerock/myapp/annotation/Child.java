package org.zerock.myapp.annotation;


public class Child extends Parent{
	
	
	@Override
	public void method2() {
		System.out.println("Child::method2() invoked");
	}

	
	
	public void method3() {
		System.out.println("Child::method3() invoked");
	}
}
