package com.company.classnotfoundexception.blc;

public class ClassNotFoundExpDemo {
	public ClassNotFoundExpDemo(String className) {
		try{
			Class<?> cls=Class.forName(className);
			System.out.println("Class loaded successfully: java.lang.String");
		}
		catch(ClassNotFoundException e) {
			System.out.println("Error: Class "+"'"+className+"'"+ "not found.");
			e.printStackTrace();
		}
	}
}
