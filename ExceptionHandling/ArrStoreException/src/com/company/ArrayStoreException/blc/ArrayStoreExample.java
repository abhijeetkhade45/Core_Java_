package com.company.ArrayStoreException.blc;

public class ArrayStoreExample {
	static Object arr[]=new String[5];
	public static void storeObjects(Object obj,int i) {
		if(obj instanceof String) {
			arr[i]=obj;
		}
		else {
			throw new ArrayStoreException();
		}
	}
}
