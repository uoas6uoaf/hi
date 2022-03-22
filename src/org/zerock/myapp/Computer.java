package org.zerock.myapp;


public class Computer extends Calculator {
	
	
	@Override
	double areaCircle (double r) {
		System.out.println("Computer::areaCircle(r) invoked.");
		
		return Math.PI * r * r;
	}

}
