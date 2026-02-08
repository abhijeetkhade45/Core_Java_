package com.company.bookprintingsystem.elc;
import com.company.bookprintingsystem.blc.*;
import java.util.Scanner;

public class BookStall {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Title: ");
		String title=sc.nextLine();
		System.out.print("Author: ");
		String author=sc.nextLine();
		System.out.print("price: ");
		double price=Double.parseDouble(sc.nextLine());
		Book b1=new Book(author, author, price);
		b1.Discount(-20.00);
		System.out.print(b1.toString());
		sc.close();
	}

}
