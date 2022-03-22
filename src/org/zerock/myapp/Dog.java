package org.zerock.myapp;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Dog extends Animal{
	
	
	
	@Override
	public void sound() {
		
		System.out.println("dog ::sound() invoked.");
		System.out.println("멍멍!!!");
	}

	
	
	
	
}
