
public class Car5 {

	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main (String[] args) {
		Car5 myCar = new Car5() ;
		
		myCar.speed = 60;
		myCar.run();
		}
}
//
//singleton -> heap에 오로지 단 한번 생성되는 객체
//->new를 한번만 사용하게 해야함 ->singleton Pattern
//생성자를 호출할 수 없도록 막기-> private 접근제한자를 생성자 앞에 붙인다.