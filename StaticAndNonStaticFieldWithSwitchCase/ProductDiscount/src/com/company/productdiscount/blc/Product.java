package com.company.productdiscount.blc;

public class Product {
	private int id;
	private String name;
	private double price;
	
	public void setProductDetails(int id,String name,double price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
	public void calculateDiscount() {
		double disc;
		if(price>5000) {
			disc=price*0.15;
		}
		else if(price>=1000 && price <=5000) {
			disc=price*0.10;
		}
		else {
			disc=price*0.05;
		}
		System.out.println("Discount Amount: "+disc);
		System.out.println("rice After Discount: "+(price-disc));
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	

}
