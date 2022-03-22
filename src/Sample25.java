
public class Sample25 {

	public static void main (String[]args) {
		
		int v1 = 5;
		int v2 = 2;
		
		// % 는 나머지를 반환하는 연산자
		//n의 배수인지 확인할 때 나머지 연산자 사용
		int result = v1 % v2;
		System.out.println("result ="+ result);
		
		//---------------------------------------------------------
		
		
		int number = 8;
		
		//이때 8이 2의 배수인지 아닌지 판단하는 로직을 어떻게 표현?
		
			
		int result1 = number % 2;
		System.out.println(result1);
		
		int result2 = number % 3;
		System.out.println(result2);
		
		
		//홀수인지 판단하는 로직
		
		int result3 = number % 2;
		//나머지가 1이면 홀수
		
				
				
		
		
	}//main
}//end class
