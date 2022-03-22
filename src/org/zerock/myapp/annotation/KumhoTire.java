package org.zerock.myapp.annotation;

public class KumhoTire extends Tire{
	
	
	public KumhoTire(String location, int maxRocation) {
		super (location, maxRocation);
	}
	
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		
		if(accumulatedRotation < maxRotation ) {
			System.out.println(
				location + "kumhoTire수명: " +
				(maxRotation - accumulatedRotation) + "회") ;
			return true;
		}else {
			System.out.println("***" + location + " Tire 펑크 ***");
			return false;
		}
	}
	
	
}
