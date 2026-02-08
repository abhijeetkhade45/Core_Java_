package com.company.seat_booking_project.elc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.util.*;
public class Seat_Booking_CUI {
	public static void main(String args[])  {
		Scanner sc=new Scanner(System.in);
		 String url = "jdbc:oracle:thin:@localhost:1521/ORCL"; 
	        String user = "dbpract";
	        String password = "1234";
		 try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection=DriverManager.getConnection(url,user,password);
			System.out.println("---Connection Created with Database !---");
			System.out.println("-----Before Autocomit is Disable :"+connection.getAutoCommit()+"----");
			connection.setAutoCommit(false);
			System.out.println("-----After Autocomit is Enable :"+connection.getAutoCommit()+"----");
			PreparedStatement pstm=connection.prepareStatement("UPDATE trainseatavailability SET AVAILABLE_SEATS = AVAILABLE_SEATS - 1 WHERE TRAIN_ID = ? AND JOURNEY_DATE = ? AND CLASS = ? AND AVAILABLE_SEATS > 0");
			pstm.setString(1, "T101");
			pstm.setString(2, "29-01-2026");
			pstm.setString(3, "Sleeper");
			int updateCount=pstm.executeUpdate();
			if(updateCount==0) {
				throw new RuntimeException("-----Seats Not Avalibal !!!!---");
			}
			else {
				System.out.println("----- Congratulation !!! Seats Locked for  Booking  SuccessFully. ----");
			}
			Savepoint savepoint=connection.setSavepoint();
			
			PreparedStatement pstm2=connection.prepareStatement("INSERT INTO bookingdetails (BOOKING_ID, TRAIN_ID, CUSTOMER_ID, SEAT_NUMBER, STATUS) VALUES (?, ?, ?, ?, ?)");
			pstm2.setString(1,"S109");
			pstm2.setString(2, "T101");
			pstm2.setString(3,"Cust-143");
			pstm2.setInt(4, 64);
			pstm2.setString(5, "Payment Pending");
			
			int uppdateCount=pstm2.executeUpdate();
			if(updateCount==0) {
				connection.rollback(savepoint);
				System.out.println("*****Failed to Insert Booking details ???****(Try Again- Your Seat is locked  !)");
				connection.rollback(savepoint);
			}
			else {
				System.out.println("Booking Details inserted Successfully !!! (Awaiting for Payment Confirmation)");
			}
		    PreparedStatement pstm3=connection.prepareStatement("SELECT PAYMENT_STATUS FROM customerpayment WHERE CUSTOMER_ID = ?");
		    pstm3.setString(1,"T101");
		    ResultSet paymentStatus=pstm3.executeQuery();
		    if(paymentStatus.equals("FAILED")) {
		    	System.out.println("***********Your Payement Failed{Failed to Book Ticket !!!} -- ");
		    	connection.rollback();
		    }
		    else {
		    	PreparedStatement pstm4=connection.prepareStatement("UPDATE bookingdetails SET STATUS = 'CONFIRMED' WHERE CUSTOMER_ID = ?");
		    	pstm4.setString(1, "T101");
		    	System.out.println("____CONGRATULATION !!!! Your Ticket is Booked Sucessfullly___________");
		    	connection.commit();
		    }
			
			
		 } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
