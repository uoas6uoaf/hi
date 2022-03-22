
public class Sample030404 {
//배열이란 같은 타입의 데이터를 0개 이상 저장할 수 있는 자료구조이자 객체이다.
//	배열변수명[인덱스번호] =>배열의 요소에 접근하는 것 -> indexing
	public static void main(String[] args) {
//		int[] scores = {83,90,87};//int는 뒤의 숫자들의 형태를 지정하는 것임
		
		
//		System.out.println("s3:" + scores[3]);//없는 인덱스번호를 입력해도 컴파일오류는 안생김 
		//실행할때 예외 발생
//		int[] scores;
		
//		int[] scores2;
//		scores2 = scores;
		
		
		scores = {1,2,3};
		scores = new int[] {1,2,3};
		//원소의 타입은 기본타입으로 선언해도 된다. 
		//*자바언어에서 배열은 한번 생성하면 , 두가지를 바꿀 수 없다ㅣ
		//*배열원소의 타입
		//*배열의 크기(길이= 원소의 개수)
		
		//참조타입명.속성명 => 참조타입의 주소의 해당하는 객체의 속성에 접근하는 방법
		// '.' 객체 맴버 참조 연산자
		
		
		System.out.println("scores: " + scores);
		
		System.out.println("scores[0]: " + scores[0]); //배열의 첫번째 원소 출력
		System.out.println("scores[0]: " + scores[1]); //배열의 두번째 원소 출력
		System.out.println("scores[0]: " + scores[2]); // 배열의 세번째 원소 출력
		
		
		int sum = 0;
		
		for(int i = 0; i<scores.length - 1 ; i++) { //배열이 저장하고 있는 모든 데이터의 합을 구하자
			sum += scores[i];
		} //for
		
		System.out.println("총합 : " + sum);
		
		double avg = (double) sum / 3; // 배열 데이터의 총합과 원소의 개수로 평균을 구하자
		System.out.println("평균 : " + avg);
		
		
		
	}//main
}//class

