package org.zerock.myapp.package4;

public class RemoteEx2 {

	public static void main (String[] args) {
		//그냥 구현 객체 생성
		SmartTv tv = new SmartTv();
		
		
		RemoteControl rc = tv;
		Searchable searchable = tv;
	}
	
}
