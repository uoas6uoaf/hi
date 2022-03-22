
public class Sam030801 {

	public static void main(String[] args) {
		
		int [][]arr = {{1,2},{3},{4,5,6},{} };
		
//		값의 목록이 지금은 없을 때 , 위와 같은 배열을 선언하여 미리
//		공간을 확보하려면 어떻게 해야 하는가?
				
		int[][] arr2 = new int [4][];//2차원의 길이는 제각각이므로 비워둔다.
		arr2 = new int [][] {{1,2},{3},{4,5,6},{}};
	}

}
