package org.zerock.myapp.annotation;

public class HankookTire extends Tire{

	
	public HankookTire(String location, int maxRocation) {
		super (location, maxRocation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		
		if(accumulatedRotation < maxRotation ) {
			System.out.println(
				location + "HankookTire수명: " +
				(maxRotation - accumulatedRotation) + "회") ;
			return true;
		}else {
			System.out.println("***" + location + " Tire 펑크 ***");
			return false;
		}
	}
	
}
