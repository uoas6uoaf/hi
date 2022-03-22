
public class Sam03031 {

	public static void main(String[] args) {

		int dansu = 2; //구구단의 단수를 저장
		
		Stark: for ( ;dansu <= 9; ++dansu) {//단수를 반복하는 반복문 2~9단까지
//			System.out.println(dansu);
			System.out.println(dansu + "단");
			
			//dansu *i = 63 일때 끝내라
			// 9와 7이 곱해질 때 끝내라
			
			for( int i = 1; i<=9; ++i ) {
//				System.out.println("\t" + i); // '\t'들여쓰기하여 출력
				System.out.println("\t" + dansu + "x" + i + "=" + (dansu *i));
				
				if(dansu * i == 63 & dansu == 9) { // 7*9 =63 ,단수가 9단이라는 조건을 설정해야함
					break Stark;
				}
			
			
			
			} //inner for 바깥쪽이 한번 돌 때 안쪽은 9번(완전히) 반복 
		
		}//outer-for
		
	}//main

}//class
 