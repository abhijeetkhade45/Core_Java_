package com.comapny.libraraymanagementproject.elc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import com.comapny.libraraymanagementproject.*;
import com.comapny.libraraymanagementproject.blc.LibararyManagement;

public class LibararyCui {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		 String url = "jdbc:oracle:thin:@localhost:1521/ORCL"; 
	        String user = "SYSTEM";
	        String password = "abhi123";
	        Connection con=null;
	        LibararyManagement libmgt=null;
	        try {
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	            con = DriverManager.getConnection(url, user, password);
	            Statement stm=con.createStatement();
	            libmgt=new LibararyManagement(stm);
	            

	        } catch (ClassNotFoundException e) {
	            System.out.println("Oracle JDBC Driver not found!");
	            e.printStackTrace();
	        } catch (SQLException e) {
	            System.out.println("Connection Failed!");
	            e.printStackTrace();
	        }
	        System.out.println("------Library_MANAGEMENT_SYSTEM------");
			System.out.println("::::: Select appropriate option ::::::");
			while(true) {
				System.out.println("---Retrive Book Details : 1");
				
				System.out.println("---Insert New Book Details : 2");

				System.out.println("---Retrive Book Details Using ID : 3");

				System.out.println("---Delete Book Details Using ID : 4");

				System.out.println("---Update Book Price using ID : 5");
				
				System.out.println("---Exite  : 6");
				System.out.println("Choice : ");
				int opt=Integer.parseInt(sc.nextLine());
				switch(opt) {
				case 1-> {
					libmgt.displayAllBooks();
					break;
					
				}
				case 2->{
					System.out.print("ID: ");
					int ID=Integer.parseInt(sc.nextLine());
					System.out.print("Title: ");
					String  title=sc.nextLine();
					System.out.print("Author: ");
					String author=sc.nextLine();
					System.out.print("Price: ");
					int price=Integer.parseInt(sc.nextLine());
					
					libmgt.insertbook(ID,title, author, price);
				}
				case 3->{
					System.out.print("ID: ");
					int ID=Integer.parseInt(sc.nextLine());
					libmgt.BookById(ID);
					break;
				}
				case 4->{
					System.out.print("ID: ");
					int ID=Integer.parseInt(sc.nextLine());
					libmgt.DeleteByBookId(ID);
					break;
				}
				case 5->{
					System.out.print("ID: ");
					int ID=Integer.parseInt(sc.nextLine());
					System.out.print("Price: ");
					int price=Integer.parseInt(sc.nextLine());
					libmgt.UpdateEmpSalById(ID,price);
					break;
				}
				case 6->{
					
					if(con!=null) {
						try {
							con.close();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					System.exit(0);
				}
				default->{
					System.out.print("Please Enter appripriate Choice !!! ");
				}
				}

			}
	}

}
