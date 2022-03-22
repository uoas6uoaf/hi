

/*
(1)여러분이 길을 걸어가다가 동굴에 빠졌습니다
(2)동굴의 깊이는 100미터입니다
(3)하루동안 열심히 올라가면 20미터를 올라갑니다
(4)자는 동안에는 5미터를 다시 미끄러져 내려갑니다

동굴에서 빠져나올려면 며칠이 걸릴까요?
		
기존값: 동굴 (100미터) 하루동안 올라가는 거리 (20미터) 미끄러지는 거리 (5미터)
주의 : 며칠에 걸쳐 올라갔는데, 내가 동굴에서 빠져나왔는지 아닌지를 언제 판단 해야 하느냐
주의2: 만일 딱 100미터 올라왔다고합시다. 그럼 이 거리를 동굴을 빠져나왔다고 생각할 수 있느냐
*/	
	
		

public class Sample50_0303 {
	public static void main(String[] args) {
		
//		#1. 상수와 변수를 나누기
		// 상수 선언 (동굴깊이, 올라가는 높이, 내려가는 높이)
		final int depth = 100;			// 동굴깊이 100m
		final int up = 20;				// 올라간다 20m
		final int down = 5;				// 내려간다 5m
		
		// 변수 선언 (현재높이, 날짜)
		int currentHeight = 0; 			// 현재높이
		int day = 0;					// 날짜
		
		System.out.println("으아아아아아아 동굴에 떨어졌어요!!");
		
//		#2. 현재높이가 동굴깊이를 초과할 때까지 반복
		
		// 하루동안 일어나는 일을 반복문으로 작성
		while (currentHeight <= depth) {
			System.out.println();
			System.out.println("----------" + day + "일차----------");
			// 하루가 시작되면 올라간다.
			currentHeight += up;
			System.out.println(up+"m만큼 올라갔어요.");
			System.out.println("현재높이는" + currentHeight + "m 예요!");
			
			// 현재높이가 동굴깊이를 초과하는 순간 밖으로 탈출
			if(currentHeight > depth) {
				System.out.println("밖이 보여요!");
				System.out.println(day + "일 만에 탈출했어요! 야호!");
				break;
			} // if
			
			// 하루동안 올라가도 동굴깊이를 넘지 못하면 잠을자고, 미끄러진다.
			System.out.println("지쳤어요. 자야겠어요 zzz");
			System.out.println("자는동안" + down + "m 미끄러졌어요."); 
			System.out.println("(" + day + "일차 최종 높이 : " + currentHeight + "m)");
			currentHeight -= down;
			// 하루 마무리
			day++;
		} // while
		
	} // main

} // end class

		






