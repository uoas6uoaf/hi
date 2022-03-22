 
public class Calculator {
	
	//필드
	
	
	
	
	//메소드
		void powerOn() { //전원의 키고 끄는것은 기본적
			System.out.println("전원을 켭니다.");
		}
		
		int plus(int x, int y) { //계산기의 동작 
			int result = x + y;
			
			return result;
		}
		
		double divide (int x , int y) {
			double result = (double) x / (double) y;
			
			return result;
			
		}
		
		void powerOff() {
			System.out.println("전원을 끕니다.");
		}
}
