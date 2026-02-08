package com.company.productclass.elc;
import com.company.productclass.blc.ProductBluePrint;
public class GetProduct {
	public static void main(String args[]) {
		ProductBluePrint p1=new ProductBluePrint();
		p1.setProductInfo("Iphone", 12, 54000.00);
		p1.getProductInfo();
		
	}
}
