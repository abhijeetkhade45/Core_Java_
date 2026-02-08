package com.company.payrollsystem.elc;
import com.company.payrollsystem.blc.*;
public class Payroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee(101, "Alice", 30000, 5000, 4000);
        Manager m = new Manager(201, "Bob", 40000, 6000, 5000, 8000);
        Trainer t = new Trainer(301, "Charlie", 35000, 4000, 3000, 3, 2000);
        Sourcing s = new Sourcing(401, "Daisy", 25000, 3000, 2000, 20, 15, 500);

        TaxUtil taxUtil = new TaxUtil();

        System.out.println("Employee  Tax: " + taxUtil.calculateTax(e));
        System.out.println("Manager Tax: " + taxUtil.calculateTax(m));
        System.out.println("Trainer Tax: " + taxUtil.calculateTax(t));
        System.out.println("Sourcing  Tax: " + taxUtil.calculateTax(s));
	}

}
