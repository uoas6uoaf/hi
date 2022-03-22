package org.zerock.myapp;


public class Child1 extends Parent{

	protected Child1 () {
		
		super(); //부모객체 생성
		
		System.out.println("child1::default constructor invoked.");
		System.out.println("\t + name: " + this.name);
		this.method();
	}//default constructor
	
	
	
	void method2 () {
	
		System.out.println("child1::method2() invoked.");
		
		Parent parent = new Parent();
		
		System.out.println(parent);
		System.out.println("\t + name: " + this.name);
	}//method 
	
	
	public static void main (String[] args) {
		Child1 child = new Child1();
		child.method2();
		
	}
}
