package com.comapny.libraraymanagementproject.blc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class LibararyManagement {
	Statement stm;

	 public LibararyManagement(Statement stm){
		 this.stm=stm;
	 }
	 public void displayAllBooks() {
		 try {
			 ResultSet rs=stm.executeQuery("select * from books");
		
				 while (rs.next()) {
					    System.out.println(rs.getInt(1) + " "
					            + rs.getString(2) + " "
					            + rs.getString(3) + " "
					            + rs.getDouble(4));
					   
					}
				 System.out.println();
			 
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
	 }
	 public void  insertbook(int ID,String title,String author,int price) {
		 try {
			 ResultSet rs=stm.executeQuery("select * from employee");
			 int updateCount = stm.executeUpdate(
					    "INSERT INTO books (id, title, author, price) " +
					    "VALUES ("+ID+", '"+title+"', '"+author+"', "+price+")");

			 if(updateCount>0) {
				 System.out.println("Book Details Added Sucessfully!!!");
			 }
			 else {
				 System.out.println("***Failed to Insert Books Details ****");
			 }
		 }
		 catch(SQLException e) {
			 e.printStackTrace();
		 }
	 }
	 public void BookById(int ID) {
		 boolean flagFind=true;
		 try {
			 ResultSet rs=stm.executeQuery("select * from books");
			while(rs.next()) {
				 if(rs.getInt(1)==ID) {
					 flagFind=false;
					 System.out.println(rs.getInt(1) + " "
					            + rs.getString(2) + " "
					            + rs.getString(3) + " "
					            + rs.getDouble(4));
					 break;
				 }
				 
			 }
			if(flagFind) {
				System.out.println("Book Details having "+ID+" not Found !!!!!!");
			}
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
	 }
	 public void DeleteByBookId(int ID) {
		 int updateCount=0;
		 try {
			
					 updateCount=stm.executeUpdate("DELETE FROM books WHERE ID ="+ID);
				
				 
		
			if(updateCount==0) {
				System.out.println("Book Details having "+ID+" not Found !!!!!!");
			}
			if(updateCount!=0) {
				System.out.println("Book Details having EID "+ID+" Is Removed !!!");
			}
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
	 }
	 public void UpdateEmpSalById(int ID,int price) {
		 int updateCount=0;
		 try {
			
			 updateCount = stm.executeUpdate(
					    "UPDATE books SET price="+price+" WHERE ID="+ID
					);

				 
			if( updateCount==0) {
				System.out.println("Employee Details having "+ID+" not Found !!!!!!");
			}
			else {
				System.out.println("Employee Details having "+ID+" Updated !!!!!!");
			}
			
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
	 }
	
}
