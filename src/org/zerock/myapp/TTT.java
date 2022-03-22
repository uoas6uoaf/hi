package org.zerock.myapp;
 

//java. 으로 시작하는 패키지들  -> "자바표준 패키지"
//javax. 로 시작하는 패키지들 -> "자바확장 패키지"
//그 외 다른 패키지 -> "내부 패키지" 우리가 사용하는 패키지는아님 JVM이 사용하는 패키지
//'*' 와일드카드 = 의미 "all"


import java.util.Scanner; //ctrl shift o

public class TTT {

	public static void main(String[] args) {

		Math.random(); //내가 만든 클래스가 아님.클래스 내부에 있지도 않음 -> 어떻게 오류가 안날까 java.lang에 있는 클래스들은 컴파일러가 알아서 자동으로 import시킴
		Scanner scanner = new Scanner(System.in );
//		->
		
	}

}
