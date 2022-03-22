package org.zerock.myapp.package3;

public class A {

	A a1 = new A (false);			
	A a2 = new A (300);
	A a3 = new A ("TTT");
	
	
	
	//생성자 오버로딩
	
	public A (boolean b) {;;} 		//public 접근 제한을 갖는 생성자
	A(int b) {;;}					//default 접근제한을 갖는 생성자
	private A (String s) {;;}		//private 접근제한을 갖는 생성자
	 
	
}//end class
