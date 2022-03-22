package org.zerock.myapp;

public class App {

	public static void main(String[] args) {

		Animal animal = new Dog(); //다형성 1
		animal.sound();				//다형성2
		
		animal = new Cat() ;		//다형성1
		animal.sound();				//다형셩2
		
	}//main

}//end class
