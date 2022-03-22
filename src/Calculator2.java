
public class Calculator2 { //오버로딩

	
	//정사각형의 넓이
	double areaRactangle(double width) {
		return width * width;
		
	
	
	}
	
	
	//직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}
}//대전제
//객체의 멤버는 인스턴드멤버(필드, 메소드) , 정적멤버(필드, 메소드)로 구분되는데
//특히 메소드에서 아래와 같은 규칙이있다,
//
//가.인스턴스 메소드 블록 내에서는 아래 멤버를 사용가능하다.
//	a.인스턴스 필드 사용가능
//	b. 인스턴스 메소드 사용가능
//	c. 정적필드 사용가능
//	d.정적 메소드 사용가능
//	
//나. 정적 메소드 블록 내에서는 아래 멤버만 사용 가능
//	a.정적필드
//	b.정적 메소드
//	**인스턴스 멤버 사용불가