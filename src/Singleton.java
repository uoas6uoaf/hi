


//목적




public class Singleton { //다른 클래스에서 객체를 생성하지 못하게 하는것
	private static Singleton obj;
	static {
		obj = new Singleton();
	}
	
	private Singleton() { //private로 해서 외부에서는 보이지 않게 캡슐화
		;;
	}
	
	static Singleton getInstance () {
		return obj;
	}
}
