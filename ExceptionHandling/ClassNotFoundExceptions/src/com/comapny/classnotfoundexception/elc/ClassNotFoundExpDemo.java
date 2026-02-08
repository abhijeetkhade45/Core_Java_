package com.comapny.classnotfoundexception.elc;

public class ClassNotFoundExpDemo {

	public ClassNotFoundExpDemo(String className) {
		try {
			Class<?> classload = Class.forName(className);
			System.out.println("Class loaded successfully: "+className);
		}
		catch(ClassNotFoundException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
	}
	

}
