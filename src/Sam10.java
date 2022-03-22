
public class Sam10 {

	public static void main (String []args) {
		//81~100
		int from = 100 ;
		int to = 81;
		
		int score = (int)(Math.random()*(to - from + 1)) + from;
		System.out.println("점수: " + score);
		
		String grade;
		
		if(score>= 90) {
			
			if(score>=95) {
				grade = "A+";
			} else {
				grade = "A";
			}
			
		}else {
				
			if(score>=85 ) {
				grade = "B+";
			}else {
				grade = "B";
			}
			
			
		}//if-else
		
		System.out.println("학점: "+ grade);
		
	}//main
}//end class
