
public class FieldEx {

	public static void main(String[] args) {
		
		//개발자도,default 샹송자도 필드의 값을 초기화 해주지 않으면
//		타입별 기본값으로 초기화한다. (정수타입-0 실수타입-0 참조타입,불린타입 - null)
		
		
		FieldInitValue fiv = new FieldInitValue();
		
		System.out.println(fiv.byteField );
		System.out.println(fiv.shortfield );
		System.out.println(fiv.intField );
		System.out.println(fiv.longField );
		System.out.println(fiv.booleanField );
		System.out.println(fiv.charField );
		System.out.println(fiv.folatField );
		System.out.println(fiv.doubleField );
		System.out.println(fiv.arrField );
		System.out.println(fiv.referenceField );
		
		
	} //main

}//end class
