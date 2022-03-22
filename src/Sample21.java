
public class Sample21 {

	public static void main(String[] args) {
		
		double number1 = 10;
		byte number2 = 20;
		
		//int result = number1 + number2;
		double result = number1 + number2;
		System.out.println(result);
		//실수를 정수로 바꿀 때는 무조건 int로 갈것
		
		
		{
			int number3 = 100;
			int number4 = 3;
			
			double result2 = (double) number3 / number4;
			System.out.println(result2);
			
		}
		
		//강제 형변환은 리소스가 많이 들어서 최대한 줄여주는게 좋음
		

		
	}//main

}//end class
