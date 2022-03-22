
public class Sample26 {

	public static void main(String[]args) {
		
		char c1 = 'A' + 1; // A의 정수값에 정수 1이 더하여 B의 정수값이 나옴 여긴 리터럴이라 선언한
//		그대로 char로 나옴
		char c2 = 'A'; 
		//char c3 = c2 + 1; rval은 변수기 때문에 타입을 따지기시작함
		int c3 = c2 + 1;
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println("c3: " +(char) c3);
		 
		
		
		
	}//main
}//end class
