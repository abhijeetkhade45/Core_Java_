package com.company.bankcards.blc;

public class CardType {
	private Customer customer;
	private String cardtype;
	public CardType(Customer customer, String cardtype) {
		super();
		this.customer = customer;
		this.cardtype = cardtype;
	}
	@Override
	public String toString() {
		return "CardType [customer=" + customer + ", cardtype=" + cardtype + "]";
	}
	
}
