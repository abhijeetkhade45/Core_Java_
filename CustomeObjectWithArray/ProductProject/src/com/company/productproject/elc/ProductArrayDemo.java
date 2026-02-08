package com.company.productproject.elc;
import java.util.*;
import com.company.productproject.blc.*;
public class ProductArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of products: ");
		int n=Integer.parseInt(sc.nextLine());
		Product product[]=new Product[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter details for Product "+(i+1)+":");
			
			System.out.println("Enter Product ID: ");
			int id=	Integer.parseInt(sc.nextLine());
			System.out.println("Enter Product Name: ");
			String name=sc.nextLine();
			System.out.println("Enter Product Price: ");
			double salary=Double.parseDouble(sc.nextLine());
			product[i]=new Product(id,name,salary);
		}
		System.out.print("Enter Product ID to search: ");
		int id=sc.nextInt();
		for(Product prod:product) {
			if(prod.getId()==id) {
				System.out.print("Product Found:"+prod);
				System.exit(0);
			}
		}
		System.out.print("Product with ID "+id+" not found.");
	}

}
