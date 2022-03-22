
public class Sample03 {

	public static void main (String [] args) {
		
		int charCode ='A'; //65정수 대입
		
		//-----
		
		if ((charCode >=65) & (charCode <= 90) ) {
			 System.out.println("대문자 이군요");
			
		}//if
		
		//------------------
		
		if ((charCode>=97) && (charCode <=122)) {
			System.out.println("소문자 이군요");//false
			//&&는 첫 값이 f면 두번째 조건을 아예 실행시키지 않음(쇼트서켓팅)
			//&는 뒤에 값도 체크함 (쇼트서켓팅 x) - 버그를 예방해 줄 수 있음
			//즉 양쪽 조건을 다 따지는 것은 기호 하나만 써야한다.
			
			
		}//if
		
		//-------------------------------------
		
		if (!(charCode<48) && !(charCode>57) ) {//부정연산자 뒤에 소괄호 써서 소괄호를 부정연산자 보다 우선순위 준것
			System.out.println("0~9 숫자 이군요"); //48 = 0의 정수값 , 57 = 9의 정수값
			
		}//if
		
		//----------------------
		
		int value = 6;
		if ((value%2 == 0) | (value%3==0)) {
			System.out.println("2또는 3의 배수 이군요");
		}//if

		//--------------------
		if ((value%2==0) || (value%3==0)) { 
			System.out.println("2또는 3의 배수 이군요");
		}//if
		
	}//main
	
	
	
}//end class
