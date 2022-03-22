package org.zerock.myapp;


public class Parent {

	protected String name = "ttt";
	
	protected Parent () {
		System.out.println("Parent::default constructor invoked.");
	}//default constructor
	
	
	protected void method() {
		System.out.println("Parent::methodinvoked.");
	}
}//end class
