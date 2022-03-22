
public class LottoNumber {

	public static void main(String[] args) {
		//로또 번호 범위 내에서, 무작위 정수를 6개를 추출하고, 
				//이 추출된 6개 번호가 아래 번호들과 일치해서, 1등인지 아닌지 판단하여 
				//1등이면 1등, 아니면 꽝이라고 출력하시오 (번호의 범위 1~45)
				//1등 당첨번호: 12, 3, 7, 17, 23, 44
				
				//과연 변수는 몇개가 필요하고 그 타입은 무엇으로 할까?
				//추출된 6개의 번호를 어떻게 1등 번호와 비교할까?
		
		int from = 1;
		int to = 45;
		
		int num1 = (int)(Math.random()*(to - from + 1)) + from;
		int num2 = (int)(Math.random()*(to - from + 1)) + from;
		int num3 = (int)(Math.random()*(to - from + 1)) + from;
		int num4 = (int)(Math.random()*(to - from + 1)) + from;
		int num5 = (int)(Math.random()*(to - from + 1)) + from;
		int num6 = (int)(Math.random()*(to - from + 1)) + from;
		
		System.out.println("1등 당첨번호는 12, 3, 7, 17, 23, 44");

		
		
		num1=3;
		num2=3;
		num3=3; 
		num4=3; 
		num5=3; 
		num6=3; 
		
		System.out.println( "중복제거 확인용 " + num1 + ","+ num2 + ","  + num3 + "," + num4  + ","+ num5 +  "," + num6);
		
		
		if (num1 == num2 | num1 == num3 | num1 == num4 | num1 == num5 | num1 == num6 ) {
			num1 = (int)(Math.random()*(to - from + 1)) + from;
		}
		
		if (num2 == num1 | num2 == num3 | num2 == num4 | num2 == num5 | num2 == num6 ) {
			num2 = (int)(Math.random()*(to - from + 1)) + from;
		}
		
		if (num3 == num1 | num3 == num2 | num3 == num4 | num3 == num5 | num3 == num6 ) {
			num3 = (int)(Math.random()*(to - from + 1)) + from;
		}
		
		if (num4 == num1 | num4 == num2 | num4 == num3 | num4 == num5 | num4 == num6 ) {
			num4 = (int)(Math.random()*(to - from + 1)) + from;
		}
		
		if (num5 == num1 | num5 == num2 | num5 == num3 | num5 == num4 | num5 == num6 ) {
			num5 = (int)(Math.random()*(to - from + 1)) + from;
		}
		
		if (num6 == num1 | num6 == num2 | num6 == num3 | num6 == num4 | num6 == num5) {
			num6 = (int)(Math.random()*(to - from + 1)) + from;
		}//중복방지 if문
		
		
		
		System.out.println("중복제거 랜덤번호는 "+ num1 + ","+ num2 + ","  + num3 + "," + num4  + ","+ num5 +  "," + num6);
		
//		num1=3;
//		num2=44;
//		num3=23; 
//		num4=17; 
//		num5=12; 
//		num6=7; 순서 상관없이 1등과 맞는지 확인하는 변수값
		
		if ((num1 == 12| num1 == 3 | num1 == 7 | num1 == 17 | num1 == 23 | num1 == 44) 
			&(num2 == 12| num2 == 3 | num2 == 7 | num2 == 17 | num2 == 23 | num2 == 44)
			&(num3 == 12| num3 == 3 | num3 == 7 | num3 == 17 | num3 == 23 | num3 == 44)
			&(num4 == 12| num4 == 3 | num4 == 7 | num4 == 17 | num4 == 23 | num4 == 44)
			&(num5 == 12| num5 == 3 | num5 == 7 | num5 == 17 | num5 == 23 | num5 == 44)
			&(num6 == 12| num6 == 3 | num6 == 7 | num6 == 17 | num6 == 23 | num6 == 44)) {
				System.out.println("1등입니다.");
		}else {
			System.out.println("꽝입니다.");
		}
	
	}//main

}//end class
