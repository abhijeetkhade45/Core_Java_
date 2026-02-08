package com.company.cakeshop.blc;
import com.company.cakeshop.blc.*;
public class OrderCake extends Cake {
	private String msg;
	public OrderCake(){
		super("Round","Vanilla",1);
	}
	public OrderCake(String shape,String flavour,int quantity){
		super(shape,flavour,quantity);
	}
	public OrderCake(String shape,String flavour,int quantity,String msg){
		super(shape,flavour,quantity);
		this.msg=msg;
	}
	public String toString() {
		if(msg==null) {
			return super.toString();
		}
		else {
			return "A"+super.getShape()+" "+super.getFlavor()+"Cake of "+super.getQuantity()+" KG is Ready with "+msg+"Message @ Rs. "+price*super.getQuantity();
		}
	}
	
}
