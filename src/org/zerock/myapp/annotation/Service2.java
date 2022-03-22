package org.zerock.myapp.annotation;

public class Service2 {

	@MyAnnotation
	public String instanceField;
	
	@MyAnnotation 
	private static int staticField;
	
	
	public Service2 (@MyAnnotation String instanceField,@MyAnnotation final int age) {
		;;
	}
	
	
	@MyAnnotation 
	private static final double PI = 3.14159;
	
	
	@MyAnnotation
	public void instanceMethod(@MyAnnotation int age) {
		@MyAnnotation
		int temp;
	}
	
	@MyAnnotation
	public static void staticMethod() {;;}
	
	
}
