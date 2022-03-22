
public class Sample_1 {
//이항연산자
	//(문자열연결연산자+)어느 한쪽이라도 string(문자열)타입이면 string으로 변수든 연산이든 형변환함
	//연산의 방향은 그대로임
	//비교연산자(==같다,!=같지않다,)
	//논리연산자(&&그리고,||또는)
	//동등비교연산자는 모든 타입에 사용
	//크기 비교 연산자는 boolean타입 제외 모든 기본타입에 사용
	
	//^표현식이 아무리 많은 연사자와 피연산자로 구성되어있더라도 그 실해 결과는 단 1개의 값(스칼라)이 나온다.
	//^표현식의 구성이 아무리 복잡해도 단 한개의 항이라도 문자열이 있으면 결국 그 실행결과는 문자열이다.
	
	public static void main (String[] args) {
		
		String str1 = "JDK" + 6.0; //산술연산자(덧셈)가 아닌 연결연산자
		String str2 = str1 + " 특징";
		
		System.out.println(str1);
		System.out.println(str2); //형변환 없음
		
		//----------------------------------------
		
		String str3 = "JDK" + 3 + 3.0; //문자열로 인식하여 계산 안됨
		String str4 = 3 + 3.0 + "JDK"; //앞에서 부터 계산되서 계산된 후 형변환
		
		System.out.println(str3);
		System.out.println(str4);
		
		
		
	} //main
}//end class
