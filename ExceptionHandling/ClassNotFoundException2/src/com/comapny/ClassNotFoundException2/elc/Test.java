package com.comapny.ClassNotFoundException2.elc;

import com.company.ClassNotFoundException2.blc.ChildClass;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass classLoad=new ChildClass();
		for(String s:args) {
			classLoad.loadingClass(s);
		}
	}

}
