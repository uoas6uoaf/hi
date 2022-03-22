
public class Switch05 {
	//java 12: switch expression
	//코드 실행은 첫번째 일치 이후에 이루어지지 않는다.
	//변수에 직접 할당할 수 있음
	//브레이크 자동으로 일어남
	
	
	public static void main(String [] args) {
		
		int number = 7;
		
		switch (number) {
		
		case 7 -> {
			System.out.println("7");
		}//case 7
		
		case 6 -> {
			System.out.println("6");
		
		//case 6 -> System.out.println("6");//실행시킬 문장이 하나이면 중괄호 생략 가능하지만 걍 생략하지마라
		
		
		
		}//case6
		
		}//switch
		
	}//main
}//end class
