package org.zerock.myapp.package4;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access=AccessLevel.PUBLIC )
public class Child extends Parent{

	public String field2;
	
	public void method3() {
		System.out.println("child::method3() invoked");
	}
	
}
