package org.zerock.myapp.package7;


public class Bus implements Vehicle{

	@Override
	public void run() {
		System.out.println("Bus::run() invoked.");
	}
	
	public void checkFare() {
		System.out.println("Bus::checkFare() invoked.");
	}

}
