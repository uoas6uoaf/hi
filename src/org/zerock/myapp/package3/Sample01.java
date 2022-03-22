package org.zerock.myapp.package3;

import lombok.extern.java.Log;

public class Sample01 {

	
	public static void main(String[] args) {
		Object obj = "TTT";
		
		
		if (obj instanceof String) {
			String s = (String) obj;
			
			int length = s.length();
			System.out.println("length; {}"+length);
		}
		
		if(obj instanceof String s) {
			int length = s.length();
			System.out.println("length; {}"+length);
		}
		
	}
}
