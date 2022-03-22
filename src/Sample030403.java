
public class Sample030403 {

	public static void main(String[] args) {

		String name = "yoseph" ;
//	/	String name = null ;
		//예외 발생 참조타입변수가 객체의 주소를 저장하지 않은 상태에서
		//객체의 기능을 사용하려고 하면 만나는 오류다. nullpointerexception
		System.out.println(name.length());
		
		String name1 = new String("신용권");
		String name2 = new String("신용권");
		
		System.out.println();
		
		
		
		
		
	}//main

}//class
