package com.company.simpleexceptiondemo3;
import java.util.*;
public class SimpleExceptionDemo3 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		throwIllegalException();
	}
	static void throwIllegalException() {
	       try {
	           throw new IllegalStateException("MyException");
	       } catch (IllegalStateException objA) {
	           System.out.println("Caught: " + objA);
	       }
	   }
}
