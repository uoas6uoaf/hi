

public class Sample030701 {

	public static void main(String[] args) {
		 
		int dansu = 2;
		tonny: for (;dansu<=9 ; dansu++) {
			System.out.println(dansu + "단");
			
			for (int i = 1;i<=9;i++) {
				System.out.println("\t" + (i*dansu));
				
				if (dansu == 9 | i == 7) {
					break tonny;
				}
				
			}//inner for
			
		}//outer for
		
	}//main

}//class
 