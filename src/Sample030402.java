
public class Sample030402 {

	public static void main (String []args) {
		//oop(object oriented programming) 객체 지향 프로그래밍
		//부품들을 만들고 조립
		//객체(object)
		
		//String 텁입의 2개의 문자열 객체가 있을 때,
		//이 두개의 문자열 객체의 주소를 저장하고 있는, 참조변수가2개가 
		//같은 주소를 가지고 있는지 아닌지 확인 예제
		
		String strVar1 = "신민철"; //객체는 한번만 생성되고 그 주소를 공유하는 것이다.
		String strVar2 = "신민철";
		
		if (strVar1 == strVar2) { //== 기본타입일때는 같은 값인지 비교 참조타입은 같은 주소를 공유하는지 ㅂㅂ교한다
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}//if-else
		
		if(strVar1.equals(strVar2)) { //진짜 문자열 안에 들어있는 각각의 문자가 동일한지 묻는것
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}//if
		
		
	}//main
	
//	자바에서 문자열 리터럴은 jvm rda의 heap영역에 한번만 생성되는 객체로 자기의 주소를 공유한다
//	기본타입도 마찬가지이다.
	//참조타입변수 안에 저장된 객체의 주소를 실무에서는 refernce (참조)라고 부른다
	//*참조타입변수에는 객체의 주소를 저장
	//*참조타입 변수의 초기값으로 null사용가능
	//*null은 객체의 주소를 가지고 있지 않다.
	
//	*클래스 - 1.붕어빵틀이다.
//	*2.1에서 찍어낸 붕어빵이 객체이다.
//	*string은 문자열객체를 찍어내는 틀이다.
	
//		배열은 같은 타입의 데이터를 연속된 공간에 저장하는 자료구조
//	배열의 인덱스는 0부터 시작한다.
	
}//class
