
public class PersonEx {

	public static void main (String[] args) {
		Person p1 = new Person("123456-1234567" , "계백") ;
		
		System.out.println(p1.nation );
		System.out.println(p1.ssn);
		System.out.println(p1.name );
		
		p1.name = "을지문덕";
		
		
		Person p2 = new Person("123456-000000", "계맥"); //객체마다 가지는 불변의 인스턴스 필드
	}
	
}
