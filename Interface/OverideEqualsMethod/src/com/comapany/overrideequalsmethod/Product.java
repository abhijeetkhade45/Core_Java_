package com.comapany.overrideequalsmethod;

import java.util.Objects;

public class Product {
	int id;
	String name;
	@Override
	public boolean equals(Object object) {
	Product obj=(Product)object;
		if(obj.id==this.id && obj.name==this.name) {
			return true;
		}
		else {
			return false;
		}
	}
	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
