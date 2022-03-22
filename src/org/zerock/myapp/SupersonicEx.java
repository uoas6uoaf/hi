package org.zerock.myapp;


public class SupersonicEx {

	
	public static void main(String[]args) {
		
		Supersonic sa = new Supersonic();
		
		sa.takeOff();//이륙
		sa.fly();//날기
		
		sa.flyMode = Supersonic.SUPERSONIC; //초음속모드로 변경
		sa.fly();//날기
		
		sa.flyMode = Supersonic.NOMAL; //정상모드로 변경
		sa.fly();//날기
		
		sa.land(); //착륙
		
	}
	
}
