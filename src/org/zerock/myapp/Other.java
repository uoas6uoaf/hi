package org.zerock.myapp;

public class Other {

	Other() {
		Parent parent = new Parent();
		System.out.println(parent.name);
		parent.method();
//		this.method; 		-> this는 상속이 안되어서 사용 불가능
		
 	}//default conctuctor
	
	
	
}
