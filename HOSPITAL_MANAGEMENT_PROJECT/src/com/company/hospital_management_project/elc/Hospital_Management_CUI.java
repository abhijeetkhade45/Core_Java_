package com.company.hospital_management_project.elc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;

import com.company.hospital_management_project.blc.Patient_Retrival;


public class Hospital_Management_CUI{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		 String url = "jdbc:oracle:thin:@localhost:1521/ORCL"; 
	        String user = "dbpract";
	        String password = "1234";
	        Connection con=null;
	         Patient_Retrival patient=null;
	        try {
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	            con = DriverManager.getConnection(url, user, password);
	           patient=new Patient_Retrival();
	            

	        } catch (ClassNotFoundException e) {
	            System.out.println("Oracle JDBC Driver not found!");
	            e.printStackTrace();
	        } catch (SQLException e) {
	            System.out.println("Connection Failed!");
	            e.printStackTrace();
	        }
	        System.out.println("------Hospital_MANAGEMENT_SYSTEM------");
			System.out.println("::::: Select appropriate option ::::::");
			while(true) {
				System.out.println("---Retrive Patient Details : 1");
				
				System.out.println("---Insert New Patient Details : 2");

				System.out.println("---Retrive Patient Details Using ID : 3");

				System.out.println("---Delete Patient Details Using ID : 4");

				System.out.println("---Update Patient contact using ID : 5");
				
				System.out.println("---Exite  : 6");
				System.out.println("Choice : ");
				int opt=Integer.parseInt(sc.nextLine());
				switch(opt) {
				case 1-> {
					try {
						patient.displayAllPatients(con.prepareStatement("select * from patients"));
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
					
				}
				case 2->{
					System.out.print("ID: ");
					int ID=Integer.parseInt(sc.nextLine());
					System.out.print("NAME: ");
					String  name=sc.nextLine();
					System.out.print("AGE: ");
					int age=Integer.parseInt(sc.nextLine());
					System.out.print("CONTACT: ");
					String contact=sc.nextLine();
					
					try {
						patient.insertPatient(ID,name,age,contact,con.prepareStatement("INSERT INTO patients (id, name, age, contact) VALUES (?,?,?,?)"));
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				case 3->{
					System.out.print("ID: ");
					int ID=Integer.parseInt(sc.nextLine());
					try {
						patient.PatientById(ID,con.prepareStatement("select * from patients"));
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				}
				case 4->{
					System.out.print("ID: ");
					int ID=Integer.parseInt(sc.nextLine());
					try {
						patient.DeleteByPatientId(ID,con.prepareStatement("DELETE FROM patients WHERE ID=?"));
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				}
				case 5->{
					System.out.print("ID: ");
					int ID=Integer.parseInt(sc.nextLine());
					System.out.print("CONTACT: ");
					String contact=sc.nextLine();
					try {
						patient.UpdatePatientContactById(ID,contact,con.prepareCall("UPDATE patients SET contact=? WHERE ID=?"));
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
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
