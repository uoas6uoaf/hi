
public class Sample05 {
//복합연산자
	//대입연산자는 가장 마지막에 수행. 앞의 연산자가 우선실행
	
	public static void main (String []args) {
		int result = 0;
		
		result += 10;
		System.out.println("result=" + result);
		//result = result + 10
		
		result -= 5;
		System.out.println("result=" + result);
		//result = result - 5
		
		result *= 3;
		System.out.println("result=" + result);
		
		result /= 5;
		System.out.println("result=" + result);
		
		result %= 3;
		System.out.println("result=" + result);
		
		//result = result % 3
		//복합 대입연산자로 result의 값을 1증가 시키는 코드를 만들어라
		
		result = 100;
		result += 1;
		System.out.println(result);
				
		
		//두가지의 정보를 알아야 두 pc가 서로간애 접속이 가능
		//ip주소(운영체제까지는 접속 가능),port번호(운영체제 위에서 구동되는 특정프로그램까지 도달 가능)
	}
}
