package com.company.classcastexception.blc;
public class ClassCastExceptionDemo {
	public static void handleClassCastException() {
		Object arr[]= {"Hello", "World", "Java"};
		try {
			for(Object e:arr) {
				String s=(String)e;
				System.out.println("Casting successful: "+s);
			}
		}
		catch(ClassCastException e) {
			System.out.println("ClassCastException: Cannot cast java.lang.Integer to String.");
			e.printStackTrace();
		}
	}
}
