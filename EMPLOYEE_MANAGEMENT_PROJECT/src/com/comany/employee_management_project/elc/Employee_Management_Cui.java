package com.comany.employee_management_project.elc;
import java.util.*;
import com.comany.employee_management_project.blc.*;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Employee_Management_Cui {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		  String url = "jdbc:oracle:thin:@localhost:1521/ORCL"; 
	        String user = "SYSTEM";
	        String password = "abhi123";
	        Connection con=null;
	        Employee_Retrival empData=null;
	        try {
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	            con = DriverManager.getConnection(url, user, password);
	            Statement stm=con.createStatement();
	            empData=new  Employee_Retrival(stm);
	            

	        } catch (ClassNotFoundException e) {
	            System.out.println("Oracle JDBC Driver not found!");
	            e.printStackTrace();
	        } catch (SQLException e) {
	            System.out.println("Connection Failed!");
	            e.printStackTrace();
	        } 
		System.out.println("------EMPLOYEE_MANAGEMENT_SYSTEM------");
		System.out.println("::::: Select appropriate option ::::::");
		while(true) {
			System.out.println("---Retrive Employee Details : 1");
			
			System.out.println("---Insert New Employee Details : 2");

			System.out.println("---Retrive Employee Details Using EID : 3");

			System.out.println("---Delete Employee Details Using EID : 4");

			System.out.println("---Update Employee Salary using EID : 5");
			
			System.out.println("---Exite  : 6");
			System.out.println("Choice : ");
			int opt=Integer.parseInt(sc.nextLine());
			switch(opt) {
			case 1-> {
				empData.displayAllEmp();
				break;
				
			}
			case 2->{
				System.out.print("EID: ");
				int EID=Integer.parseInt(sc.nextLine());
				System.out.print("EFNAME: ");
				String  EFNAME=sc.nextLine();
				System.out.print("ELNAME: ");
				String ELNAME=sc.nextLine();
				System.out.print("ESAL: ");
				int ESAL=Integer.parseInt(sc.nextLine());
				System.out.print("EADRESS:");
				String EADDRESS=sc.nextLine();
				
				empData.insertEmp(EID,EFNAME, ELNAME, ESAL, EADDRESS);
			}
			case 3->{
				System.out.print("EID: ");
				int EID=Integer.parseInt(sc.nextLine());
				empData.EmpById(EID);
				break;
			}
			case 4->{
				System.out.print("EID: ");
				int EID=Integer.parseInt(sc.nextLine());
				empData.DeleteEmpById(EID);
				break;
			}
			case 5->{
				System.out.print("EID: ");
				int EID=Integer.parseInt(sc.nextLine());
				System.out.print("ESAL: ");
				int ESAL=Integer.parseInt(sc.nextLine());
				empData.UpdateEmpSalById(EID,ESAL);
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
