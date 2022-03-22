
public class Sample002 {
	public static void main (String []args) throws Exception {
		
		Outter: for(char upper = 'A'; upper <= 'Z'; upper++) {
			
			for(char lower = 'a'; lower <='z';lower++) {
				System.out.println(upper + "-"+ lower);
				
					if(lower == 'g') {
						break Outter;
						
					}//if
			}//inner for
		}//outter-for
		
	}//main
}
