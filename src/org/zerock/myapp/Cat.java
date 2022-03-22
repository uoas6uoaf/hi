package org.zerock.myapp;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Cat extends Animal{
	
	
	
	@Override
	public void sound() {
		
		System.out.println("Cat ::sound() invoked.");
		System.out.println("야옹!!!");
	}

	
	
	
	
}
