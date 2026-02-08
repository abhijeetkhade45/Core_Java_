package com.company.bankcards.blc;

public class CardOnOffer {
	public static CardType getOfferCard(Customer customer){
		int cpoint=customer.getcPoint();
		if(cpoint>1000) {
			return new CardType(customer,"Platinum");
		}
		else if(cpoint<=500 && cpoint<=1000) {
			return new CardType(customer,"Gold");
		}
		else if(cpoint>=100 && cpoint<500) {
			return new CardType(customer,"Silver");
		}
		else {
				return new CardType(customer,"EMI");
		}
	}
}
