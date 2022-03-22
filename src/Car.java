
public class Car {
//필드 (모델링 대상 객체의 속성의 종류와 값을 정의)
//	String compaany = "현대자동차";
//	String model = "그랜저";
//	String color = "검정";
	
	//관례 필드도 연관성있는 것과 모아주고 없는건 띄운다
	//생성자도 두칸 띄운다
	
	String compaany = "현대자동차"; 
	String model ;
	String color ;
	int  maxSpeed;
			
	//중요: 생성자 오버로딩 (다중정의)
	//원칙: 각 생성자의 매개변수의 개수/순서/타입이 달라야함
	//부분적으로 필드의 초기화를 목적에 맞게 사용
	//중복코드를 없애는 식으로 해야함.
	Car() {
	;;
	}//기본생성자
	
	Car(String model) {
		this.model = model;
	}//생성자ㅣ1
	
	Car (String model, String color) {
		this.model = model;
		this.color = color;
	}//생성자2
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}//생성자3
	
	
//	String compaany ; //필드를 만들 때는 정의하지 않고 선언만 한다.
//	String model ;
//	String color ;
//	
//	int maxSpeed ;
//	int speed; //현재속도
//	
//	
//	public Car(int maxSpeed){ //변수가 생성자 안에 있으면 매개변수라고 한다.
//		this.maxSpeed = maxSpeed ; //모든 필드를 매개변수를 선언할 필요는 없다.
		
	} //default constructor
	
	
}//end class
