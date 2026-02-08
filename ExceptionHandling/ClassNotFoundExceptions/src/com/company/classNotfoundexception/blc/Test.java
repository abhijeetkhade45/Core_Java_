package com.company.classNotfoundexception.blc;
import java.util.*;

import com.comapny.classnotfoundexception.elc.ClassNotFoundExpDemo;
public class Test {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the class name to load:");
		String className=sc.nextLine();
		ClassNotFoundExpDemo load=new ClassNotFoundExpDemo(className);
		
		
	}
}
