/*
 * Jennifer Swofford
 * APC 350 - Assignment 1
 * Due Feb 6
 *  
 */


/*
 *Requirements:
 * AvaCam Inc. needs a program to compute their payroll files.
 *  -Users will enter the number of employees in the file.
 *  -File contains LastName, Firstname, HourlyRate, HoursWorked
 *  
 *  Program will compute the following:
 *  Gross Salary
 *  Taxes
 *  Net Income
 *  
 *  Running the program will produce an output file containing the following for each employee:
 *  FirstName
 *  LastName
 *  PayRate
 *  HoursWorked
 *  GrossSalary
 *  Taxes
 *  NetIncome
 *  
 *  When program completes, identify the # of employees, the total payroll amount, total taxes, and the netpay total
 *  
 *  Tax Bracket Salary:
 *  <=$250, 18%
 *  $251-$550, 23%
 *  $551-$1100, 28%
 *  >1100, 33% 
 *  
 */



package assignment_1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.*;

public class Assignment_1 {

	public static void main(String[] args) throws FileNotFoundException {
		//Declare all variables 
		String 	lastName, firstName;
		double 	payRate, hours, grossSalary, indvTax, netIncome;
		int 	employeeCount;
		double  totalGrossPay 	= 0;
		double  totalTaxes 		= 0;
		double  totalNetPay 	= 0;
		double  taxRate1 		= .18;
		double  taxRate2 		= .23;
		double  taxRate3 		= .28;
		double  taxRate4 		= .33;
		
		//create/associate stream objects
		Scanner inFile = new Scanner(new FileReader("employees.txt")); 
		PrintWriter outFile = new PrintWriter("employees-out.txt");
		
		//Ask for employee count in the file
		employeeCount = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of employees in the file"));
		
		//loop through the input file to get name, pay rate, & hours
		for (int i = 1; i <=employeeCount; i++) {
			lastName 	= inFile.next();
			firstName	= inFile.next();
			payRate 	= inFile.nextDouble();
			hours		= inFile.nextDouble();
			
			//calculate the gross salary
			grossSalary = payRate * hours;
			
			//Determine Proper Tax Bracket
			if (grossSalary > 1100) {
					indvTax 	= grossSalary*taxRate4;
					netIncome	= grossSalary-indvTax;
				
			}
			
			else if (grossSalary > 550) {
				indvTax 	= grossSalary*taxRate3;
				netIncome	= grossSalary-indvTax;
			}
			
			else if (grossSalary > 250) {
				indvTax 	= grossSalary*taxRate2;
				netIncome	= grossSalary-indvTax;
			}
			
			else  {
				indvTax 	= grossSalary*taxRate1;
				netIncome	= grossSalary-indvTax;
			}
			
			//Produce output file
			outFile.printf(	"First Name:   "  	+ firstName +
							"\nLast Name:    " 	+ lastName);
			outFile.printf(	"\nPay Rate:     $%5.2f", payRate);
			outFile.printf(	"\nHours Worked: " 	+ hours);
			outFile.printf("\nGross Salary: $%5.2f",grossSalary);
			outFile.printf("\nTaxes:        $%5.2f", indvTax);
			outFile.printf("\nNet Income:   $%5.2f", netIncome);
			outFile.printf("\n\n");
			
			//Calculate Employee Totals
			totalGrossPay 	+= grossSalary;
			totalTaxes 		+= indvTax;
			totalNetPay 	+= netIncome;
				
			
		}
		//Update the output File with the totals
		outFile.printf("Number of Employees Processed: " + employeeCount);
		outFile.printf("\nTotal Payroll:        $%.2f", totalGrossPay);
		outFile.printf("\nTotal Taxes:          $%.2f", totalTaxes);
		outFile.printf("\nPayroll Checks Total: $%.2f",totalNetPay);
		
		//close files
		inFile.close();
		outFile.close();
	}

}
