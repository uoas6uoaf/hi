
public class While {

	public static void main(String[] args) {
		int sum = 0; // 결과를 보관하는 변수
		int i = 1;
		
		while(i<=100) {
			sum += i;
			i++;
			
		}//while
		
		System.out.println("i~" + (i-1)+"합 : " + sum);
	}//main

}//class
