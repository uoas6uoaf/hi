
public class Computer {

	int sum1(int[] values) {
		int sum = 0;
		for (int number: values) {
			sum += number;
		}
		return sum; //return 메소드를 끝낸다.되돌려줄 값이 있다면 
		
	}
	
	int sum2(int ...values) { //가변인자를 만들 대 사용(...) 가변인자는 배열과 같다.
		int sum = 0;
		for(int i =0 ; i < values.length ; i++) {
			sum += values[i];
		}
		return sum;
	}
}
