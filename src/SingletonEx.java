
public class SingletonEx {

	public static void main(String[] args) {

//		Singleton obj1 = new Singleton(); //컴파일에러
//		Singleton obj2 = new Singleton(); //컴파일에러
		
//		
//		
//		Singleton obj1 = Singleton.getInstance();
//		Singleton obj2 = Singleton.getInstance();
//		
//		if (obj1 == obj2) {
//			System.out.println("같은 singleton 객체입니다.");
//		}else {
//			System.out.println("다른 singleton  객체입니다.");
//		}
//	}
		
		for (int i = 0; i<10; i++) {
			Singleton obj = Singleton.getInstance();
			System.out.println(obj);
		}
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		assert obj1 == obj2 ;
		
		
	
	
	}
	
	
		
		

}
