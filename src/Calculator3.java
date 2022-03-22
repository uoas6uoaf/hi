
public class Calculator3 {

//	static double pi = 3.14159; // 하드코딩
	
	static double pi; //컴파일러가 자동으로 생성한 이니셜라이즈
	
	int age;
	
	
	static {
		System.out.println("invoked");
		
		
//		pi = 3.14159;
		pi = Math.PI; //상수의 이름은 대문자로 짓는게 관례
	} //static initializer
	
	
	static int plus(int x , int y) {
		return x + y;
	}
	
	static {
		System.out.println("invoked2");
	}
	
	
	static int minus(int x, int y) {
		return x - y;
	}
	
	static {
		System.out.println("invoked3");
	}
}
