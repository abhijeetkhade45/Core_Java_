package com.comapany.passwordgenerator.elc;
import java.util.*;
import java.util.function.*;
public class PasswordGen {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);

		 String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 String lower = "abcdefghijklmnopqrstuvwxyz";
		 String digits = "0123456789";
		 String special = "@#$%!&*";
		 String set=upper+lower+digits+special;
		 Supplier<String> password=()->{
			 Random random=new Random();
			 StringBuilder sb=new StringBuilder();
			 for(int i=1;i<=8;i++) {
				 sb.append(set.charAt(random.nextInt(set.length()-1)));
			 }
			 return sb.toString();
		 };
		 System.out.println("Generated Password: "+password.get());
	}
}
