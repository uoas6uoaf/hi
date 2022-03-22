
public class Television {

	
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	
	double price;
	
	static {
		info = company + "-" + model;
	}
	
	void instanceMethod1() { //인스턴스메소드
		System.out.println(this.price ); //인스턴스 필드 사용 가능
		System.out.println(Television.model); //정적필드답게 사용하라. 클래스명.이름
		
		this.instanceMethod2(); //인스턴스메소드 사용
		Television.staticMethod(); //정적메소드 사용
		
		//다른 클래스의 메소드를 호출
		TTT ttt = new TTT(); //객체를 만들어준다.
		ttt.instanceMethod();
		
		TTT.staticMethod(); //객체 생성 필요없이 클래스명.이름만 불러오면 된다.
		
	}
	
	void instanceMethod2() { //인스턴스 메소드
		System.out.println(this.price ); //같은 클래스라면 객체를 따로 만들지 않아도 사용 가능하다.
	}
	
	static void staticMethod () { //정적메소드
		
		System.out.println(Television.model);
		
		Television obj = new Television(); //정적메소드에서 인스턴스메소드를불러올 때는 객체 생성을 해준다.
		System.out.println(obj.price);
		
	}
}

class TTT {
	
	void instanceMethod() {;;}
	
	
	static void staticMethod() {;;}
	
}