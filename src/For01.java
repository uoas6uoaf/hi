
public class For01 {
	public static void main (String[]args) {
		
		//1.초기식 :변수를 정의 (단 한번만 수행)
		//2.조건식 : for block을 반복수행할지 말지를 결정
		//3.증감식 : 1에서 정한 변수의 값을 변경
		//for=반복할 수를 알고 있을 때 쓰인다.
		//초기식이라고 해서 for안에서 초기식을 작성할 필요가 없다
//		int i; i = 카운터 변수,루프제어변수
		//초기식은 생략 가능하다 (;은 생략 불거능) ,다른데서 해야함
		//증감식도 생략가능하다 마찬가지로 (제어문 안에서) 다른데서 해도된다.(;은 생략 불가능)
		for (int i = 1; i<= 10; i++) {
			System.out.println(i);
		}//for
		int i = 1;
		for (;;) { //괄호를 비우면 컴파일러가 무한 루핑을 돈다고 판단한다 else로 끝내주는 실행문 만들기
			//무한루프 만들거면 탈출조건 만들기 (아래 if)
			if (i <= 10) {
				System.out.println(i);
			}else {//for문을 끝내라
				break;
			}//if-else
			
			++i;
		} //for
		
		//System.out.println(i); //변수가 i를 for 초기식 안에서 선언 했기때문에 변수의 유효범위 때문에 실행되지 않음
	} //main
}//end class
