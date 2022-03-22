package org.zerock.myapp.package5;


public interface IParent {

	public abstract void method1();
	
	public default void method2() {
		System.out.println("Iparent::method2() invoked." );
	}
	
}
