package org.zerock.myapp.package7;


public class Ex {

	public static void main(String [] args) {
		
		ImplementationC impl = new ImplementationC(); //구현객체 생성
		
		InterfaceA ia = impl;			//다형성-1 (부모:A)
		
		ia.methodA();
		System.out.println();
		
		
		
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();
		
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
	}//main
	
	
}//end class
