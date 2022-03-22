package org.zerock.myapp.package3;

public class SmartPhone extends Phone{

	
	public SmartPhone (String owner) {
		super(owner);		//부모가 있어야 자식도 있다.
	}
	
	
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다");
	}
}
