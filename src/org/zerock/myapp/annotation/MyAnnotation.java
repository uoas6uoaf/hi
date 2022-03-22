package org.zerock.myapp.annotation;

import java.lang.annotation.ElementType;

import javax.lang.model.element.Element;

public @interface MyAnnotation {

//	@Target(value = {ElementType.TYPE}) -타입선언부에만 어노테이션을 붙일 수있다(열거타입,클래스타입)
	String value();
	int number() default 30;
}
