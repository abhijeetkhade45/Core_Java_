package com.company.hospital_management_project.blc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Patient_Retrival {
	

	 public void displayAllPatients(PreparedStatement stm) {
		 try {
			 ResultSet rs=stm.executeQuery();
		
				 while (rs.next()) {
					    System.out.println(rs.getInt(1) + " "
					            + rs.getString(2) + " "
					            + rs.getInt(3) + " "
					            + rs.getString(4));
					   
					}
				 System.out.println();
			 
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
	 }
	 public void  insertPatient(int ID,String name,int age,String contact,PreparedStatement stm) {
		 try {
			 stm.setInt(1, ID);
			 stm.setString(2,name);
			 stm.setInt(3, age);
			 stm.setString(4,contact);
			 int updateCount = stm.executeUpdate();
			 
			 if(updateCount>0) {
				 System.out.println("Patinet  Details Added Sucessfully!!!");
			 }
			 else {
				 System.out.println("***Failed to Insert Patient Details ****");
			 }
		 }
		 catch(SQLException e) {
			 e.printStackTrace();
		 }
	 }
	 public void PatientById(int ID,PreparedStatement stm) {
		 boolean flagFind=true;
		 try {
			 ResultSet rs=stm.executeQuery();
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
				System.out.println("Patient Details having "+ID+" not Found !!!!!!");
			}
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
	 }
	 public void DeleteByPatientId(int ID,PreparedStatement stm) {
		 int updateCount=0;
		 try {
			 stm.setInt(1,ID);
					 updateCount=stm.executeUpdate();
				
				 
		
			if(updateCount==0) {
				System.out.println("Patient Details having "+ID+" not Found !!!!!!");
			}
			if(updateCount!=0) {
				System.out.println("Patient Details having EID "+ID+" Is Removed !!!");
			}
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
	 }
	 public void UpdatePatientContactById(int ID,String contact,PreparedStatement stm) {
		 int updateCount=0;
		 try {
			stm.setString(1,contact);
			stm.setInt(2,ID);
			 updateCount = stm.executeUpdate();

				 
			if( updateCount==0) {
				System.out.println("Patient Details having "+ID+" not Found !!!!!!");
			}
			else {
				System.out.println("Patient Details having "+ID+" Updated !!!!!!");
			}
			
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
	 }
	
}

