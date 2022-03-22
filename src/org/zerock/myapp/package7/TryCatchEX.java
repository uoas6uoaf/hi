package org.zerock.myapp.package7;


public class TryCatchEX {

	public static void main (String [] args) {
		
		String data1 = null;
		String data2 = null;
		
		try {
			data1 = args[0];
			data2 = args[1];
			
			int result = Integer.parseInt(args[1]);
			System.out.println("result : " + result);
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행매개값의 수가 부족합니다.");
			System.out.println("[실행방법]");
			System.out.println("java TryCatchEx  num1 num2");
			
			return; //이 문장을 만나는 즉시 메소드의 실행을 종료시키고 값이 있다면 반환한다.
		}//try - catch
		
		
	}//main
}//end class
