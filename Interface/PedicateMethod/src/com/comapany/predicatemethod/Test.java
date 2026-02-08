package com.comapany.predicatemethod;
import java.util.*;
import java.util.function.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a Number :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(n+" is even: "+testPredicate(n,(a->a%2==0)));
		System.out.println(n+" is greater than 10: "+testPredicate(n,(a->a>10)));
		System.out.println(n+" is prime: "+testPredicate(n,(a->{
			int c=0;
			for(int i=1;i<=(a);i++) {
				if(a%i==0) {
					c++;
				}
			}
			if(c>2) {
				return false;
			}
			else {
				return true;
			}
		})));
	}
	public static boolean testPredicate(int n,Predicate<Integer> p) {
		return p.test(n);
	}

}
