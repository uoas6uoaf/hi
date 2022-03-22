
public class Sample07 {

	public static void main(String[] args) {
		
		//ㅅ기대했던 조건과 실행흐름 => happy path
		//예상하지 않았던 조건과 실행흐름 => Alternative path (대체흐름)
		
		
		int score = 85;
		
		if (score >= 90) { //true
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		} else { //false
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}//if-else
		
	}//main

}//end class
