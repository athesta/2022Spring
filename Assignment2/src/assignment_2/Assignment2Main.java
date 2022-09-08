/*
 *  Jennifer Swofford
 *  APC 350 - Assignment 2
 *  Due Mar6
 *      
 */

/*
 * Requirements:
 *  Purpose: Use methods to develop a program to help a company w/ payroll computations.
 *  
 *  First line of file: Overtime Rate (1.3);
 *  Remaining Lines: lastName firstName payRate hoursWorked
 *  
 *  1. Use starter code attached to Assignment
 *  2. Capture # of employees via dialog box
 *  3. Read employes 1 at a time. 
 *  4. Compute:
 *     grossSalary 	= hoursWorked*payRate
 *     taxes		= taxRate*grossSalary
 *     netIncome	= grossSalary-taxes
 *  5. Produce payroll info to user in dialog box
 *  6. Produce output file with the same information (payroll.txt)
 *  	Format of output in file for EACH EMPLOYEE:
 *  		Hours:
 *  		Rate of Pay:
 *  		Overtime Rate:
 *  		Gross Salary: 
 *  		Taxes:
 *  		Net Income:
 *  	Summary/Rollup Info in output file:
 *  		Number of Employees Processed:
 *  		Total Payroll: (Sum of gross Salaries)
 *  		Total Taxes: (Sum of all taxes)
 *  		Payroll Checks Total:  (sum of all net income)
 *  
 *  
 */

package assignment_2;

import javax.swing.*;
import java.io.*;
import java.util.*;

public class Assignment2Main {

	//User Instruct method
	public static void userInstruct() {
		//Instructs the user about the program.
		//Pre: none
		//Post: none
		JOptionPane.showMessageDialog(null, "This program will calculate the payroll for AvaCam Inc."
				+ "\n\n Please count the number of employees in your file before preceeding.");
	}

	
	//findSalary method
	public static double findSalary(double hours, double hrRate, double otRate) {
		//finds the employees salary based on hours worked, the hourly rate, & ot rate
		//Pre: Needs hours worked, hourly rate, OT rate (types double)
		//Post: returns salary (type double)
		double salary;
		double otHourly = otRate*hrRate; 				//calculates the hourly rate for OT
		if(hours>40)									//If user worked more than 40 hours, calc salary w/ OT
			salary = (hrRate*40)+((hours-40)*otHourly); //calculates the salary for 40 hours, then remaining OT.
		else salary = hours * hrRate;					//Else if emp worked 40 or fewer hours, calc salary w/o OT.
		return salary;
	}

	
	//findTaxes method
	private static double findTaxes(double salary) {
		double taxes;
		if (salary <= 250.00)
			taxes = salary * .18;
		else if (salary <= 550.00)
			taxes = salary * .23;
		else if (salary <= 1100.00)
			taxes = salary * .28;
		else taxes = salary * .33;
		return taxes;
	}
	
	
	
	//findNetIncome method
	private static double findNetIncome(double grossSalary, double taxes) {
		double NetInc = grossSalary-taxes;
		return NetInc;
	}

	
	//displayPayroll method with hours, salary, taxes and netIncome goes here
	public static void displayPayroll(double hours, double hrPay, double sal, double tax, double net) {
		JOptionPane.showMessageDialog(null,
									String.format("Hours: %.2f"
												+ "\nRate of Pay: $%.2f"
												+ "\nGross Income: $%.2f"
												+ "\nTaxes: $%.2f"
												+ "\nNet Income: $%.2f", hours,hrPay,sal,tax,net),
									"Payroll",JOptionPane.INFORMATION_MESSAGE);
	}

	
	//displayPayroll method with hours, rateOfPay, overtimePay, salary, taxes and netIncome goes here
	public static void displayPayroll(double hours, double hrPay, double otPay, 
										double sal, double tax, double net) {
		JOptionPane.showMessageDialog(null,
				String.format("Hours: %.2f" 
							+ "\nRate of Pay: $%.2f"
							+ "\nOT Pay Rate: %.2f"
							+ "\nGross Income: $%.2f"
							+ "\nTaxes: $%.2f"
							+ "\nNet Income: $%.2f", hours,hrPay,otPay,sal,tax,net),
				"Payroll",JOptionPane.INFORMATION_MESSAGE);
	}
	
//	//writePayroll method with hours, salary, taxes, netIncome and a printwriter goes here
	private static void writePayroll(double hours, double hrPay,double sal, double tax, double net, PrintWriter outFile) {
		outFile.printf(	"\nHours Worked: " 	+ hours);
		outFile.printf(	"\nPay Rate:     $%5.2f", hrPay);
		outFile.printf("\nGross Salary: $%5.2f",sal);
		outFile.printf("\nTaxes:        $%5.2f", tax);
		outFile.printf("\nNet Income:   $%5.2f", net);
		outFile.printf("\n");
	}

	//writePayroll method with hours, rateOfPay, overtimePay, salary, taxes, netIncome and a printwriter goes here
	private static void writePayroll(double hours, double hrPay, double otPay,  double sal, double tax, double net, PrintWriter outFile) {
		outFile.printf(	"Hours Worked: " + hours);
		outFile.printf(	"\nPay Rate:     $%5.2f", hrPay);
		outFile.printf(	"\nOT Pay Rate: %5.2f", otPay);
		outFile.printf("\nGross Salary: $%5.2f",sal);
		outFile.printf("\nTaxes:        $%5.2f", tax);
		outFile.printf("\nNet Income:   $%5.2f", net);
		outFile.printf("\n");
	}
	
	public static void QA() throws FileNotFoundException {
	
	// This is the QA method.  
	// You should develop your methods (as listed in the assignment and above) one at
	// a time and test them using this QA method.  You should make sure that each method you
	// develop works before moving to development of the next method.  
	
	// YOU MUST NOT CHANGE THE STATEMENT OF THIS QA METHOD.  You may however, uncomment the 
	// sections when testing the corresponding method  
	
		System.out.println("Starting with QA");
		
		//create dummy values for testing the methods		
		double hoursBelow40 = 23, hoursAbove40 = 47;
		double rateOfPay = 13, overtimeRate = 1.3;
		double salary, taxes, netIncome;
		double salaryBelowFirstTaxBracket = 250;
		double salaryBelowsecondTaxBracket = 500;
		double salaryBelowThirdTaxBracket = 1000;
		double salaryAbovelastTaxBracket = 2000;
		
		//testing userInstruct - don't develop the next method until this is done. 
		//uncomment the following to test the method
		
		  System.out.println("Testing userInstruct"); userInstruct();
		 
		
		//testing findSalary - don't develop the next method until this is done.
		//uncomment the following to test the method
		
		System.out.println("\n\nTesting findSalary");
		salary = findSalary(hoursBelow40, rateOfPay, overtimeRate);
		System.out.println("Salary for "+ hoursBelow40 + " hours at rate " + rateOfPay + ": " + salary);
		salary = findSalary(hoursAbove40, rateOfPay, overtimeRate);
		System.out.println("Salary for "+ hoursAbove40 + " hours at rate " + rateOfPay + " and overtime rate " + overtimeRate +": " + salary);
		

		//testing findTaxes - don't develop the next method until this is done.
		//uncomment the following to test the method
		
		System.out.println("\n\nTesting findTaxes");
		taxes = findTaxes(salaryBelowFirstTaxBracket);
		System.out.printf(" Taxes for "+ salaryBelowFirstTaxBracket + ": %.2f", taxes);	
		taxes = findTaxes(salaryBelowsecondTaxBracket);
		System.out.printf("\n Taxes for "+ salaryBelowsecondTaxBracket + ": %.2f",taxes); 
		taxes = findTaxes(salaryBelowThirdTaxBracket);
		System.out.printf("\n Taxes for "+ salaryBelowThirdTaxBracket + ": %.2f", taxes);
		taxes = findTaxes(salaryAbovelastTaxBracket);
		System.out.printf("\n Taxes for "+ salaryAbovelastTaxBracket + ": %.2f", taxes);
		 
		
		
		//testing findNetIncome- don't develop the next method until this is done.
		//uncomment the following to test the method
		
		System.out.println("\n\nTesting findNetIncome");
		netIncome = findNetIncome(salaryAbovelastTaxBracket, taxes);
		System.out.printf(" Net Income: %.2f", netIncome);
		
		
		//testing displayPayroll method with hours, salary, taxes and netIncome 
		//don't develop the next method until this is done.
		//uncomment the following to test the method
		
		System.out.println("Testing displayPayroll method with 4 parameters: hours, salary, taxes and netIncome");
		displayPayroll(10, 10, 100, 5, 15);
		
		
		//testing displayPayroll method with hours, rateOfPay, overtimePay, salary, taxes and netIncome
		//don't develop the next method until this is done.
		//uncomment the following to test the method
		
		System.out.println("\n\nTesting displayPayroll method with 6 parameters:/nhours, rateOfPay, overtimePay, salary, taxes and netIncome");
		displayPayroll(20.0, 13.0, 20.0, 200.0, 50.0, 150.0);
		
		
		PrintWriter outFile = new PrintWriter("QA.txt");
		
		
		//testing writePayroll method with hours, salary, taxes, netIncome and printWrite
		//don't develop the next method until this is done.
		//uncomment the following to test the method
		
		
		  System.out.println("writePayroll method with hours, rate, salary, taxes, netIncome and printWrite"); 
		  writePayroll(10,10, 100, 5, 15, outFile);
		  outFile.println();
		 

		
		//testing writePayroll method with hours, rateOfPay, overtimePay, salary, taxes, netIncome and printWrite
		//don't develop the next method until this is done.
		//uncomment the following to test the method
		
		  System.out.println("writePayroll method with hours, rateOfPay, overtimePay, salary, taxes, netIncome and printWrite");
		  writePayroll(20, 13, 20, 200, 50, 150, outFile);
		  outFile.close();
		
		System.out.println("\nDone with QA");
	}

	
	public static void main(String[] args) throws FileNotFoundException{

		QA();
		
		
		  //Once done with QA, comment the above call to QA. Then uncomment the
		  //partially developed code below and complete it to accomplish // the task of
		  //the assignment.
		  
		  String firstName; 
		  String lastName;
		  
		  //Replace the path with the path to the file on your computer Scanner inFile
		  Scanner inFile = new Scanner(new FileReader("employees.txt"));
		  
		  //Replace the path with the path to the file on your computer PrintWriter
		  PrintWriter outFile = new PrintWriter("payroll.txt");
		  
		  int hoursWorked; 
		  int numEmployeesToProcessed; 
		  double grossSalary, payRate, overtimeRate, taxes, netIncome;
		  double totalSalary=0; 
		  double totalTaxes=0;
		  double payrollChecksTotal=0; 
		  numEmployeesToProcessed = Integer.parseInt(JOptionPane.showInputDialog("How many employees to process?"));
		  
		  overtimeRate = inFile.nextDouble();
		  
		  for (int i = 1; i<=numEmployeesToProcessed; i++){ 
			  lastName 		= inFile.next();
			  firstName 	= inFile.next(); 
			  payRate 		= inFile.nextDouble(); 
			  hoursWorked 	= inFile.nextInt();
		  
		  
			  grossSalary 	= findSalary(hoursWorked,payRate,overtimeRate);	//YOUR CODE GOES HERE 
			  taxes		 	= findTaxes(grossSalary);						//YOUR CODE GOES HERE
		  	  netIncome 	= findNetIncome(grossSalary,taxes);				//YOUR CODE GOES HERE

		  	  if (hoursWorked>40) {
			  displayPayroll(hoursWorked, payRate, overtimeRate, grossSalary, taxes, netIncome);
			  writePayroll(hoursWorked, payRate, overtimeRate, grossSalary, taxes, netIncome, outFile);
		  	  }
		  	  else {
		  		  displayPayroll(hoursWorked, payRate, grossSalary, taxes, netIncome);
		  		  writePayroll(hoursWorked, payRate, grossSalary, taxes, netIncome, outFile);
		  	  }
		  	  
			  outFile.println("----------------------------------------------------------");
			  

			  
			  totalSalary 			+= grossSalary;
			  totalTaxes 			+= taxes;
			  payrollChecksTotal	+= netIncome;
			  }
		  
			  outFile.println("----------------------------------------------------------"); 
			  outFile.println(String.format("Number of Employees Processed:\t%d",
			  numEmployeesToProcessed));
			  outFile.println(String.format("Total Payroll:\t\t\t$%.2f", totalSalary));
			  outFile.println(String.format("Total Taxes:\t\t\t$%.2f", totalTaxes));
			  outFile.println(String.format("Payroll Checks Total:\t\t$%.2f",
			  payrollChecksTotal));
			  
			  inFile.close(); 
			  outFile.close();
		  }
		 
		
		//End of main code
	}
