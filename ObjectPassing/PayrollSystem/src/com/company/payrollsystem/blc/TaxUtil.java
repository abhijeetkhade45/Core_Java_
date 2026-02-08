package com.company.payrollsystem.blc;

public class TaxUtil {
	 public double calculateTax(Employee e) {
	        double gross = e.calculateGrossSalary();
	        return (gross > 50000) ? (gross * 0.20) : (gross * 0.05);
	    }

	    public double calculateTax(Manager m) {
	        double gross = m.calculateGrossSalary();
	        return (gross > 50000) ? (gross * 0.20) : (gross * 0.05);
	    }

	    public double calculateTax(Trainer t) {
	        double gross = t.calculateGrossSalary();
	        return (gross > 50000) ? (gross * 0.20) : (gross * 0.05);
	    }

	    public double calculateTax(Sourcing s) {
	        double gross = s.calculateGrossSalary();
	        return (gross > 50000) ? (gross * 0.20) : (gross * 0.05);
	    }
}
