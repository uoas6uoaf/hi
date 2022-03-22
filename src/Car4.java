
public class Car4 {

	//인스턴스필드
	String model;
	int speed;
	
	//생성자:인스턴스필드의 초기화를 담당
	Car4 (String model) {
		this.model = model;
	}
	
	//인스턴스 메소드 
	void setSpeed(int speed) { //Setter 메소드       (현재 필드값을 새로 설정할 때)      
		this.speed = speed;
	}
	
	int getSpeed () { // getter 메소드    (현재 필드의 값을 되돌려줄 때)
		return this.speed; 
	}
	
	
	//인스턴스 메소드
	void run() {
		for(int i = 10; i<=50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달랍니다. (시속: " + this.speed + " km/h)");
		}//for
	}//run
}//end class
