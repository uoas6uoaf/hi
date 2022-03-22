
public class Sample04 {

	public static void main (String[] args) {
		int value = 100;
		
		//문제: value의 숫자는 50보다 크고, 90보다 작냐를 물어보는 조건식 만들기
		//2.value 값이 변수값이 소수인지 판단하라 
		//1과 자신의 숫자로만 나누어서 판단하라
		
		if( (value%1==0) & (value%value==0) ) {
			System.out.println("소수(prime number)입니다");
		}//if
		
		
		
		//if (!((value>50) & (value<90))) {
			
			//System.out.println("소수(prime number)입니다");
	
		
		//}//if
		
	}//main
} //end class
