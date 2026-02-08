package com.company.classnotfoundexception.elc;
import java.util.*;

import com.company.classnotfoundexception.blc.ClassNotFoundExpDemo;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the class name to load:");
		String className=sc.nextLine();
		ClassNotFoundExpDemo load=new ClassNotFoundExpDemo(className);
	

	}

}
