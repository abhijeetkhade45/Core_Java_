package com.company.cakeshop.blc;

public abstract class  Cake {
	private String shape;
	private String flavor;
	private int quantity;
	public static double price=400;
	public Cake(String shape, String flavor, int quantity) {
		super();
		this.shape = shape;
		this.flavor = flavor;
		this.quantity = quantity;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String toString() {
		return "A"+shape+"Cake of "+quantity+"kg is Ready @ Rs. "+price*quantity;
	}
	
}
