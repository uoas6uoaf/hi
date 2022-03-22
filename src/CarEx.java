
public class CarEx {
 
	public static void main (String[] args) {
		Car myCar = new Car(350); //객체생성, 350: 전달인자(argument)
		
		System.out.println("제작회사: "+ myCar.compaany);
		System.out.println("모델명: "+ myCar.model);
		System.out.println("색깔: "+ myCar.color );
		System.out.println("최고속도: "+ myCar.maxSpeed );
		System.out.println("현재속도 "+ myCar.speed  );
		
		myCar.speed = 60;
		 System.out.println("수정된 속도: " + myCar.speed );
		 
	}//main
}//class
