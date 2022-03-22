
public class Switch06 {
//switch expression2
	public static void main(String[] args) {

		int number =10;
		
		int result = switch (number) {
						default -> 0;
						case 1 -> 100;
						case 2 -> 1+2+3;
						case 3 -> number;
//						case 4 -> true; // 타입 미스매치
//						case 5 -> {
//							중괄호써서 복잡한 로직을 수행시키는 것은 불가능하다
//						};
						case 6 -> 400;
//						default -> 0;
							};//switch
		System.out.println(result);
		
	}//main

}//end class
