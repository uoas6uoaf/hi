package org.zerock.myapp.package7;


public class ClassExceptionEx {

	public static void main (String [] args) {
		Dog dog = new Dog();			//dog객체 생성
		ClassExceptionEx.changeDog(dog);//메소드 호출(자식 객체 전달)
		
		
		Cat cat = new Cat();			//Cat 객체생상
		ClassExceptionEx.changeDog(cat);//메소드호출
	}
	
	//매개변수의 타입이 상속관게에서 부모 타입으로 선언
	public static void changeDog(Animal animal) { //매개변수에서 다형성-1 발생
		
		if(animal instanceof Dog dog) {
//		Dog dog = (Dog) animal;						//classException 발생 가능
	}
	
	
}
class Animal{;;}
class Dog extends Animal{;;}
class Cat extends Animal{;;}

}
