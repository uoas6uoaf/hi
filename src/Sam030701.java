
public class Sam030701 {

	public static void main(String[] args) {

		int[] arr1 = new int[3];
		
		for(int i = 0; i<3;i++) {
			System.out.println("arr1[" + i + "]" + arr1[i]); 
		}//for
		
		for (int number : arr1) //무조건 적용되는 것은 아니고 반복 가능한 것만 가능하다
			//iterable 객체만 enhanced for에 올 수 있다.
			System.out.println(number);
		
		
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2]= 30;
		
//		for(int i = 0; i<3;i++) {
//			System.out.println();
//		}//classical for
	
		for (int num : arr1) {
			System.out.println(num);
		}
		
	}//main

//	자바언어의 이름을 짓는 규칙
//	1.영대소문자,숫자
//	2'_','$'만 가능하다
//	3첫번째 문자가 숫자로 시작할 수 없다.
//	기본적으로 camal기법적용
//	변수명:소문자로 시작,특수기호시작
//	클래스명: 대문자로 시작
//	메소드명:소문자로 시작
	
	
}//class