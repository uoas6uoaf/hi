
public class sample20 {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		
//		byte byteValue3 = byteValue1 + byteValue2;
//		두 연산자는  byte로 연산이 되지만 연산 결과인 값 30은 int로 가정하기 때문에 결론적으로 강제 형변환을
//		동원하지 않는다면 오류가 난다. 
		
		byte byteValue3 = (byte) (byteValue1 + byteValue2);
		int intValue1 = byteValue1 + byteValue2;
		
		System.out.println(intValue1);
		System.out.println(byteValue3);
		
		
		

	}//main

}//end class
