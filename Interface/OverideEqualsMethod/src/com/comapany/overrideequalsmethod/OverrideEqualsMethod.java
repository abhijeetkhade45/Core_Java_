package com.comapany.overrideequalsmethod;
import java.util.*;
import com.comapany.overrideequalsmethod.*;
public class OverrideEqualsMethod {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Product p1=new Product(101,"Abhi");
		Product p2=new Product(101,"Abhi");
		System.out.println(p1.equals(p2));
	}
}

