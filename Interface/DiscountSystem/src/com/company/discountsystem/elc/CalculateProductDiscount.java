package com.company.discountsystem.elc;
import com.company.discountsystem.blc.*;
import java.util.*;
import java.util.function.*;
public class CalculateProductDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Product Id :");
		int id=Integer.parseInt(sc.nextLine());
		System.out.print("Enter Product Name :");
		String name=sc.nextLine();
		System.out.print("Enter Product Price :");
		Double price=Double.parseDouble(sc.nextLine());
		Function<Product,Double> discount=prod->{
			if(prod.price()>=5000) {
				return (Double)prod.price()-(prod.price()*0.1);
			}
			else{
				return (Double)prod.price()-(prod.price()*0.05);
			}
		};
		Product item=new Product(id,name,price);
		System.out.println("Final price of the product is :"+discount.apply(item));
		

	}

}
