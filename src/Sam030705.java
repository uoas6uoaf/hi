
public class Sam030705 {

	public static void main(String[] args) {
		
		Week today = Week.SUNDAY; //열거상수로 초기화하여 열거타입변수 정의
		
		String name = today.name();
		System.out.println(name);
		
		int ordinal = today.ordinal(); //순서
		System.out.println(ordinal); 
			
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY ;
		
		int result1 = day1.compareTo( day2 ); //빼는것
		int result2 = day2.compareTo( day1 );
		
		System.out.println(result1);
		System.out.println(result2);
		
		Week[] days = Week.values();//모든 열거 상수를 반환해주는 메소드
		
		for(Week day : days) {
			System.out.println(day);
		}
			String typeOfDay = null;
			typeOfDay = switch(today) {
			case MONDAY,TUESDAY,WEDNESDAY ,THURSDAY ,FRIDAY -> {
				System.out.println("1st. case");
				System.out.println("\t+ Working Day");
				
				yield "working day";
					
			}
			case SATURDAY ,SUNDAY -> {
				System.out.println("2st. case");
				System.out.println("\t+ Day Off");
				
				yield "Day Off";
				
			}
			
		}
			
		
			
	}//main
	
 
}//class
