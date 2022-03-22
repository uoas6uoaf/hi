import java.util.Arrays;


public class calculstorEx {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(args));
		
		Calculator myCalc = new Calculator(); //전자계산기 생성
		myCalc.powerOn();; //메소드 호출
		
		int result1 = myCalc.plus(5,6); //아래처러 sysout안하거나 값을 되돌릴것이 아니라면 변수이름 정의안하고
		//호출만 해도된다.
		System.out.println(result1);
		
		byte x = 10;
		byte y =4;
	
		double result2 = myCalc.divide(x,y);
		System.out.println(result2);
		
		myCalc.powerOff();
	}

}
