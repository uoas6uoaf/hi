package org.zerock.myapp.bicycle;


public class Bicycle {
	
	//자전거의 고유데이터
	public static String modelName; 
	public static double weight; 
	public String brandName; 
	
	
	//자전거의 부품
	Frame frame = new Frame("알류미늄","검정");
	Seat seat = new Seat();
	Pedal pedal = new Pedal("pvc 페달");
	Wheels wheels = new Wheels();
	Handle handle = new Handle(5);
	Gear gear = new Gear(50,0);

	public Bicycle (String brandName) {
		this.brandName = brandName;
	}//constructor
	

	static {
		modelName = "5-1조";
		weight = 15;
	}//static initializer
	
	
	//메소드

	int run() { //기어메소드
		
		if (gear.gearOn()== false) {
			Pedal.pedalStop();
			return 1;
		}//if
		
		return 0;
	
	}//run
	
}//class







