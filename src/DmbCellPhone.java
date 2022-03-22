import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
public class DmbCellPhone extends CellPhone{
	
	//1. 필드
	int channerl;
	
	
	//2. 매개변수가 있는 생성자
	DmbCellPhone(String model, String color, int channel) {
		System.out.println("DmbCellphone(");
		this.model = model;
		this.color = color;
		this.channerl = channel;
	} //constuctor
		
	
	
	//메소드
	void turnOnDmb() {
		System.out.println("채널 " + channerl + "번 DMB 방송 수신을 시작합니다.");
	}//turnOnDmb
	
	void changeChannelDmb(int channel) {
		this.channerl = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다");
	}//changeChannelDmb
	
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}//turnOffDmb
	
}//end class
