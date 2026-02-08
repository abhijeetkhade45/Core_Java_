package com.company.numformatenullpointerexcetion.elc;
import java.util.*;

import com.company.numformatenullpointerexcetion.blc.ExceptionHandlingDemo;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Input : ");
		String s=sc.nextLine();
		if(s.length()==0) {
			s=null;
		}
		ExceptionHandlingDemo.handleExceptions(s);
		sc.close();
	}

}
