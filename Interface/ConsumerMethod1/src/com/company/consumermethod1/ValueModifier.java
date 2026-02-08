package com.company.consumermethod1;
import java.util.*;
import java.util.function.*;
@FunctionalInterface
public class ValueModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Original value: ");
		int value=sc.nextInt();
		
		Consumer<Integer> incrementBy=num->System.out.println("After incrementing the value by 3: "+(num+3));
		Consumer<Integer> squareValue=num->System.out.println("After squaring the value:  "+(num*num));
		modifyValue(value,(num->System.out.println("After doubling the value: "+(num*2))));
		modifyValue(value,incrementBy);
		if(value>0) {
			modifyValue(value,squareValue);
		}
	}
	public static void modifyValue(int value,Consumer<Integer> consumer) {
		consumer.accept(value);
	}

}
