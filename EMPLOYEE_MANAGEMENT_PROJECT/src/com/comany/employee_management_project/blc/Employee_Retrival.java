package com.comany.employee_management_project.blc;
import java.sql.*;
public class Employee_Retrival {
	Statement stm;
	 public Employee_Retrival(Statement stm){
		 this.stm=stm;
	 }
	 public void displayAllEmp() {
		 try {
			 ResultSet rs=stm.executeQuery("select * from employee");
		
				 while (rs.next()) {
					    System.out.println(rs.getInt(1) + " "
					            + rs.getString(2) + " "
					            + rs.getString(3) + " "
					            + rs.getDouble(4) + " "
					            + rs.getString(5));
					}
				 System.out.println();
			 
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
	 }
	 public void  insertEmp(int EID,String EFNAME,String ELNAME,int ESAL,String EADDRESS) {
		 try {
			 ResultSet rs=stm.executeQuery("select * from employee");
			 int updateCount = stm.executeUpdate(
					    "INSERT INTO EMPLOYEE (EID, EFNAME, ELNAME, ESAL, EADDRESS) " +
					    "VALUES ("+EID+", '"+EFNAME+"', '"+ELNAME+"', "+ESAL+", '"+EADDRESS+"')");

			 if(updateCount>0) {
				 System.out.println("Employee Details Added Sucessfully!!!");
			 }
			 else {
				 System.out.println("***Failed to Insert Employee Details ****");
			 }
		 }
		 catch(SQLException e) {
			 e.printStackTrace();
		 }
	 }
	 public void EmpById(int EID) {
		 boolean flagFind=true;
		 try {
			 ResultSet rs=stm.executeQuery("select * from employee");
			while(rs.next()) {
				 if(rs.getInt(1)==EID) {
					 flagFind=false;
					 System.out.println(rs.getInt("EID") + " "
					            + rs.getString("EFNAME") + " "
					            + rs.getString("ELNAME") + " "
					            + rs.getDouble("ESAL") + " "
					            + rs.getString("EADDRESS"));
					 break;
				 }
				 
			 }
			if(flagFind) {
				System.out.println("Employee Details having "+EID+" not Found !!!!!!");
			}
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
	 }
	 public void DeleteEmpById(int EID) {
		 int updateCount=0;
		 try {
			 ResultSet rs=stm.executeQuery("select * from employee");
			
					 updateCount=stm.executeUpdate("DELETE FROM EMPLOYEE WHERE EID ="+EID);
				
				 
		
			if(updateCount==0) {
				System.out.println("Employee Details having "+EID+" not Found !!!!!!");
			}
			if(updateCount!=0) {
				System.out.println("Employee Details having EID "+EID+" Is Removed !!!");
			}
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
	 }
	 public void UpdateEmpSalById(int EID,int ESAL) {
		 int updateCount=0;
		 try {
			 ResultSet rs=stm.executeQuery("select * from employee");
			
			 updateCount = stm.executeUpdate(
					    "UPDATE EMPLOYEE SET ESAL="+ESAL+" WHERE EID="+EID
					);

				 
			if( updateCount==0) {
				System.out.println("Employee Details having "+EID+" not Found !!!!!!");
			}
			else {
				System.out.println("Employee Details having "+EID+" Updated !!!!!!");
			}
			
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
	 }
	 
	 
}
