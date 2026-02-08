package com.company.productdata.elc;
import java.util.*;
import com.company.productdata.blc.Product;
public class ProductArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of Products :");
		int numOfProduct=Integer.parseInt(sc.nextLine());
		
		Product products[]=new Product[numOfProduct];
		for(int i=1;i<=numOfProduct;i++) {
			System.out.println("Enter details for Product "+i+":");
			System.out.println("Enter Product ID: ");
			int id=Integer.parseInt(sc.nextLine());
			System.out.println("Enter Product Name:  ");
			String name=sc.nextLine();
			System.out.println("Enter Product Price: ");
			double price=Double.parseDouble(sc.nextLine());
			Product emp=new Product(id,name,price);
			products[i-1]=emp;
		}
		System.out.println("Enter Product ID to search: ");
		int productId=Integer.parseInt(sc.nextLine());
		for(int i=0;i<products.length;i++) {
			if(products[i].getId()==productId) {
				System.out.println("Product Found: "+products[i]);
				System.exit(0);
			}
		}
		System.out.println("Product with ID "+productId+" Not Found");
	}

}
