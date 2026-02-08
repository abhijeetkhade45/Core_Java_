package com.company.productclass.blc;

public class ProductBluePrint {
  String productName;
  int productId;
  double productprice;
  
  public void setProductInfo(String pname,int pid,double pprice) {
	  
	  productName=pname;
	  productId=pid;
	  productprice=pprice;
	  
  }
  public void getProductInfo() {
	  
	  System.out.println("product Name:"+productName);
	  System.out.println("product ID:"+productId);
	  System.out.println("product price:"+productprice);
	  
  }
	
}
