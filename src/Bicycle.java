
public class Bicycle {
	//자전거의 고유데이터
	String modelName; //
	String brandName; //
	
	static double weight; // 
	
	
	//상태
	boolean breakLever;
	String handleDerection;
	boolean pedalWork;
	
	//자전거의 부품
	Frame frame ; 
	Seat seat;
	Pedal pedal;
	Wheels wheels;
	Handle handle;
	

	public Bicycle() {
		this(null);
	}//constructor
	
	public Bicycle (String modelName) {
		this(modelName , null);
	}//constructor1
	
	public Bicycle (String modelName, String brandName) {
		this(modelName, brandName , false);
	}//constructor2
	
	public Bicycle (String modelName, String brandName, boolean breakLever) {
		this(modelName, brandName , breakLever , null);
	}//constructor3
	
	public Bicycle (String modelName, String brandName, boolean breakLever, String handleDerection) {
		this.handleDerection = modelName;
		this.brandName = brandName ;
		this.breakLever = breakLever;
		this.handleDerection = handleDerection;
		
	}//constructor4
	
	
	static {
		weight = 15;
	}//static initializer
	
	
	
	//메소드
	static void getOn () {
		System.out.println("자전거를 탑니다.");
	} //탑승 메소드
	
		void setPedal(boolean pedalWork) {
			this.pedalWork = pedalWork;
		} //페달밟음
	
			boolean moveBi() {
				if (this.pedalWork  == true) {
					return true;
				}
				else {
					return false;
				}//if - else
	
			}//moveBi
	
	static void getOff () {
		System.out.println("자전거에서 내립니다.");
	}
	
	

}//class







