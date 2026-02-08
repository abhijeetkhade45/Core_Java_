package com.company.carrelatedexception.elc;
import java.util.*;

import com.company.carrelatedexception.blc.CarHeatException;
import com.company.carrelatedexception.blc.CarPunctureException;
import com.company.carrelatedexception.blc.CarStoppedException;
import com.company.carrelatedexception.blc.CarTest;
public class CarUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			CarTest.Stop("stop");
		} catch (CarStoppedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		try {
			CarTest.Stop("go");
		} catch (CarStoppedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		try {
			CarTest.puncture("puncture");
		
		} 
		catch ( CarPunctureException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		try {
			CarTest.puncture("move");
		} catch (CarPunctureException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		try {
			CarTest.CarHeatException(60);
		} catch (CarHeatException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		try {
			CarTest.CarHeatException(40);
		} catch (CarHeatException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		
	}

}
