
public class CarEx3 {

	public static void main(String[] args) {
		
		Car3 myCar = new Car3(); //인스턴스 생성
		
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		if (gasState) {
			System.out.println("출발합니다.");
			myCar.run();
			
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
			
		}else {
			System.out.println("gas를 주입하세요");
		}
	}

}
