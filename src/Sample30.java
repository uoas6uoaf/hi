
public class Sample30 {

	public static void main(String[] args) {

		String name = "TTT";
		int age = 23;
		double weight = 58.3;
		double height = 172.5;
		
		String result = String.format("1. name: %s", name);
		System.out.println(result);
		
		result = String.format("2. age : %s", age);
		System.out.println(result);
		
		
		result = String.format("3.weight: %s", weight);
		System.out.println(result);
		
		result = String.format("4. height: %s", height);
		System.out.println(result);
		
		//4개를 한거번에 입력하는 방법
		result = String.format(
				"name: %s, age: %s, weight: %s , height: %s", 
				name, age, weight, height); //순서를 반드시 지켜야한다.
		System.out.println(result);
		
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		//배열의 각 원소의 값을 하나의 문자열로 모두 출력하라
		
		 result = String.format("[%s,%s,%s,%s,%s,%s,%s,%s,%s]", 
				arr[0],arr[1],arr[2],arr[3],arr[4],arr[5],arr[6],arr[7],arr[8]);
		
		System.out.println(result);
		
		
		
		
	}

}
