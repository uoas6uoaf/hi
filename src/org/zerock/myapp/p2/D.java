package org.zerock.myapp.p2;

import org.zerock.myapp.p1.A;


public class D extends A {

	public D() {
		
		super() ;
		
		
		//protected의 진자 alpha의 의미
		this.field = "TTT";
		this.method();
		
	}//default constructor
	
	void method2 () {
		this.field = "DDD";			//위에서 부모 객체가 생겼기 때문에 오류나지 않음
									//부모객체는 어디에 생성하든 모두 사용가능하다.
		
//		A a = new A (); 			//protected 접근제한자에 걸림
		
	}
	
	
}//end class
