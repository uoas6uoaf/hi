
public class Sample18 {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;//컴파일러가 Rvalue를 Lvalue로 자동 형변환한 것
		
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;
		
		System.out.println("가의 유니코드=" + intValue);
		
		
		
		
	}

}
