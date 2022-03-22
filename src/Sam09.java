
public class Sam09 {

	public static void main(String[] args) {
//		로또번호: 1(from) ~ 45(to)
//		int num = (int)(Math.random()*3) + 3; 3~6까지 
		
		int from = 1 ;
		int to = 45;
		
		int num = (int)(Math.random()*(to - from + 1)) + from; 
			System.out.println(num);
			
	}

}
