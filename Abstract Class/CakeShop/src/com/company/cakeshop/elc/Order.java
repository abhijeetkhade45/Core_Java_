package com.company.cakeshop.elc;
import java.util.*;
import com.company.cakeshop.blc.*;
public class Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Cake cake=new OrderCake();
		System.out.println(cake.toString());
		cake=new OrderCake("Round","Chocklate",4);
		System.out.println(cake.toString());
		cake=new OrderCake("Round","Chocklate",4,"Happy Birthday ");
		System.out.println(cake.toString());
		sc.close();

	}

}
