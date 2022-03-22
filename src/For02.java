
public class For02 {

	public static void main(String[] args) {

		for (float x = 0.1f;x<=1.0f;x+=0.1f) {
			System.out.println(x);
			
		}
	}
//for문은 실수형을 실행할 수는 있지만 근사값으로 계산하기 때문에 버그가 생길 수 있어 
	//카운터 변수의 값으로 실수는 잘 쓰지 않는다
	//*카운터변수의 값으로 실수를 사용해서는 안된다
	//*즉 정수를 카운터 변수의 값으로 사용해야한다
}
