package com.company.inventorysystem.elc;
import com.company.inventorysystem.blc.*;
import java.util.*;
public class InventoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Item Name: ");
		String item=sc.nextLine();
		System.out.print("Enter Price Per Unit: ");
		double pricePerUnit=sc.nextDouble();
		System.out.print("Enter Quantity In Stock: ");
		int quantityInStock=sc.nextInt();
		InventoryItem i=new InventoryItem(item,pricePerUnit,quantityInStock);
		System.out.println("Inventory Item Details:");
		System.out.println("Item Name: "+i.getItemName());
		System.out.println("Price Per Unit: "+i.getPricePerUnit());
		System.out.println("Quantity in Stock: "+i.getQuantityInStock());
		System.out.println("Total Inventory Value: "+i.totalValue());
		sc.nextLine();
		System.out.print("Any updation in Stock Price OR Quantity [YSE/NO] :");
		String uc=sc.nextLine();
		if(uc.equalsIgnoreCase("NO")) {
			System.exit(0);
		}
		else {
			System.out.print("Enter Price Per Unit: ");
			double npricePerUnit=sc.nextDouble();
			System.out.print("Enter Quantity In Stock: ");
			int nquantityInStock=sc.nextInt();
			i.setPricePerUnit(npricePerUnit);
			i.setQuantityInStock(nquantityInStock);
			System.out.println("Updated Inventory Item Details:");
			System.out.println("Item Name: "+i.getItemName());
			System.out.println("Price Per Unit: "+i.getPricePerUnit());
			System.out.println("Quantity in Stock: "+i.getQuantityInStock());
			System.out.print("Total Inventory Value: "+i.totalValue());
			
		}
	}

}
