import java.util.Arrays;

public class Sam030704 {

	public static void main(String[] args) {
		String[] oldStrArray = {"java","array","copy"};
		String[] newStrArray = new String[5] ; 
		
		//배열의 복사: system.arraycopy(originArr,offset, targetArr,offset,length)
		System.arraycopy(oldStrArray, 0,newStrArray,0,oldStrArray.length);
		
		System.out.println(Arrays.toString(newStrArray));
		
	}

}
//자바언어에서는 두 변수의 값을 비교할 때 아래와같은 원칙으로 값을 생성하게 되어있ㅇ,ㅁ
//1. 기준 == 비교 ==> return 0
//2.기준 < 비교 ==> return 음수값
//3.기준 > 비교 ==> return 양수값