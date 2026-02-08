package com.company.productdiscount.elc;

import java.util.Scanner;
import com.company.productdiscount.blc.*;
public class ProductDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Product ID: ");
		int id=Integer.parseInt(sc.nextLine());
		System.out.print("Enter Product Name: ");
		String name=sc.nextLine();
		System.out.print("Enter Product Price: ");
		double price=Double.parseDouble(sc.nextLine());
		Product p1=new Product();
		p1.setProductDetails(id, name, price);		
		System.out.print("----- Product Details -----");
		System.out.print(p1);
		p1.calculateDiscount();
		
		
		
				
	}

}
