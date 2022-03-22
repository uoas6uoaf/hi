package org.zerock.myapp.package3;


public class AnimalEx {

	public static void main(String[]args) {
		
		Dog dog = new Dog() ;
		Cat cat = new Cat();
		
		//자식객체가 구현한 소리를 발생시킴
		//자식객체의 메소드를 단순 호출(다형성 없음)
		dog.sound();
		cat.sound();
		
		System.out.println("-------------사용 (이용) 관계로써 자식객체 활용-------------");
		
		Animal animal = null;			//부모타입변수선언
		
		animal = new Dog() ;			//다형성-1
		animal.sound();					//다형성-2
		
		animal = new Cat();
		animal.sound();
		
		System.out.println("-------------");

		
		animalSound(new Dog());
		animalSound(new Cat());
		
	} //main
	
	
	//메소드의 매개변수의 타입이 추상클래스인 부모타입
	public static void animalSound(Animal animal) { // = Animal animal = new Dog();
		animal.sound();					//다형성-2
	}//animalsound
	
	 
}
