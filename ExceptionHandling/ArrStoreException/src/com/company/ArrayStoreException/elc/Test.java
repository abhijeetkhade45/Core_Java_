package com.company.ArrayStoreException.elc;

import com.company.ArrayStoreException.blc.ArrayStoreExample;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ArrayStoreExample.storeObjects("Abhijeet", 0);
			ArrayStoreExample.storeObjects("Harishchandra", 1);
			ArrayStoreExample.storeObjects("ff", 2);
			System.out.println("Objects stored successfully.");
		}
		catch(ArrayStoreException e) {
		System.out.println("ArrayStoreException caught: Incompatible type: java.lang.Integer cannot be stored in an array of java.lang.String");
		}
	}

}
