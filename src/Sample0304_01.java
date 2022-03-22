
public class Sample0304_01 {

	public static void main(String[] args) { //파일 깨지면 워크스페이스에서 인코딩 바꾸기
		
		int number = 10;
		
		switch(number) {
		case 1 -> System.out.println(1); // 중괄호 없야서 블록을 생략한경우(그러나 생략하지마라)
		case 2 -> { //중괄호 기호로 블록을 생성한 경우
			System.out.println(2);
		}//case2
		
		case 10 -> {
			System.out.println(10);
		}//case10
		
		default -> {
			System.out.println("no nstch");
		}
		
		}//switch
		
		//case 2
		
		
		
	}//main

}//class
