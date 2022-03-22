

public class Sam030406 {

	public static void main(String[] args) {
		Week today = Week.FRIDAY;
		
		String typeOfDay = null;
		
		switch(today) {
		case MONDAY :
		case TUESDAY :
		case WEDNESDAY :
		case THURSDAY :
		case FRIDAY : typeOfDay = "Working Day" ; break;
		case SATURDAY :
		case SUNDAY : typeOfDay = "Day Off" ; break;
		}
		
	}

}
