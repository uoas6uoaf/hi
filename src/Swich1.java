
public class Swich1 {
	public static void main (String [] args) {
		int num = (int)(Math.random()*6) + 1;
		System.out.println("num=" + num);
		
		switch(num) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;//매칭되면 다른 케이스는 실행되지 않음
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;	
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		case 6:
			System.out.println("5번이 나왔습니다.");
			break;
		default:
			System.out.println("6번이 나왔습니다.");//디폴트에는 브레이크를 넣지 않음
			
		}//switch
		
		
		
		
//	디폴트의 위치는 상관없다. 디폴트의 위치가 맨 밑이 아니라면 브레이크가 없기 때문에 위나 중간에는 넣어준다.
//		
				
				
	}//main
	
}//end class
