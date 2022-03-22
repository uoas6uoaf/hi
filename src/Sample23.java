
public class Sample23 {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("------------");
		
		//대전제
		//증감연산자가 단독으로만 사용되는 경우에는, 전위/후위의 의미가 없다
		x++; // 후위 증가 연산자
		++x; // 전위 증가 연산자
		
		System.out.println("x="+x);
//		x = x -1; --> --y or y--
		
		
		System.out.println("-----------------");
		
		y--;
		--y;
		
		System.out.println("y="+y);
		
		
//		y = y -1; --> --y or y--
		
		System.out.println("-----------------");
		
		System.out.println("3. x=" + x);
		z = x++; //후위 증가 연산자 사용
		//x를 먼저 z에 대입하고 
//		z = x; 
//		x= x+1; 
		System.out.println("4. z="+z);
		System.out.println("5. x="+x);
		
		System.out.println("-----------------");
		
		//전위연산자는 자기자신부터 증가 시키고 후에 대입함
		//x = x+1
		//z = x
		
		z = ++x;
		System.out.println("z=" + z);
		System.out.println("x="+x);
		
		System.out.println("-----------------");

		z = ++x + y++;
		
		System.out.println("z ="+z); //x가 전위연산자라 이 식에서는 15이고 y는 아직 8
		System.out.println("x =" + x);//앞에 x는 1 증가해서 15
		System.out.println("y ="+ y); //후위 연산자가 대입되서 9
		
		
		
		
		
		
	}//main

}//end class
