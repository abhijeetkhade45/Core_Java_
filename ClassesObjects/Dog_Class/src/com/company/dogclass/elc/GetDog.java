package com.company.dogclass.elc;
import com.company.dogclass.blc.*;
public class GetDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DogBluePrint d1=new DogBluePrint();
		d1.name="Ruby";
		d1.height=3.6;
		d1.age=14;
		d1.getDogInformation();
		d1.bark();
	}

}
