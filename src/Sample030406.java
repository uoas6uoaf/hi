
public class Sample030406 {

	public static void main(String[] args) {

//	과제: 배열을 이용하여 소수(prime number)인지 판정하라
//	전제: 1.배열: int[] intArray = {87,13,5,99,133,30,27};
// 	문제: 위에서 제시된 배열의 각 원소가 소수인지 판정해서 출력하라
//	힌트: 배열의 순회(traverse)가 필요하다 (by using array indexing) =>반복문필요
//		 소수 판정 기준: 주어진 숫자가,
//		  가. 1로 나누어 떨어지고(나머지가 0)
//		  나. 자기자신의 숫자로도 나누어 떨어지고
//		  다. 1과 자기자신을 제외한 중간 숫자들로는 나누어떨어져서는 안된다
		
	int [] intArray = {87,13,5,99,133,30,27};
	int num = 2 ;
	boolean prime;
	
	
	for(int i=0;i<intArray.length-1;i++) {
		
		prime = true;
		
		
		for(;num<intArray[i]-1;num++) {
			if(intArray[i]%num == 0) {
				prime = false;
			}//if
			
			
		}//inner for
		if (prime == true) {
			System.out.println("소수입니다.");
		}else {
			System.out.println("소수가 아닙니다");
		}//if else
		
		
	}//for

	
	}//main
	
}//class
	