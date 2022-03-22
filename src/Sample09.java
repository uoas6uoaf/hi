
public class Sample09 {
	public static void main (String[] args) {
		int num = (int)(Math.random()*6) + 1;  
		//무작위 난수 생성: 1(offset), 6개(length) 정수 추출
		//int num = (int)(Math.random()*3) + 3; 3~6까지 
		
		//난수 = 무작위수
		//Math.random() --0.0 ~ < 1.0 
		//0 <= Math.random() < 1.0
		
		//(0.0*6) <= math.randome()* 6 <( 1.0*6)
		// 0.0    <= (int)math.r () * 6 ) < (int) 6.0
		//   0 +1 <= (int) math.randome() * 6 )+1  < 6 +1
		//      1 <= (int) math.randome() * 6 )+ 1  < 7
		//      1 <= (int) math.randome() * 6(추출할 숫자의 총 수) )+ 1(무작위로 생성할 처음값)  < 7
		
		//[0.0,1.0) 0.0을 포함하고 1.0은 포함하지 않는다. half-open
		//포함한다면 [0.0,1.0]
		
		if (num ==1) {
			System.out.println("1번이 나왔습니다.");
		} else if (num ==2) {
			System.out.println("2번이 나왔습니다.");
		}else if (num ==3) {
			System.out.println("3번이 나왔습니다.");
		}else if (num ==4) {
			System.out.println("4번이 나왔습니다.");
		}else if (num ==5) {
			System.out.println("5번이 나왔습니다.");
		}else  {
			System.out.println("6번이 나왔습니다.");
		}//if-else
		
	}//main
	
	
	
	
	
	
}//end class
