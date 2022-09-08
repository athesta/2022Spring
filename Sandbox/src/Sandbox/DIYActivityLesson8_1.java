package Sandbox;

import javax.swing.JOptionPane;

public class DIYActivityLesson8_1 {

	public static void main(String[] args) {
		int numEmp;
		 //Ask user for # of employees
		numEmp = Integer.parseInt(JOptionPane.showInputDialog("How many employees to process?"));
		double sum = 0;
		double [] salary;
		String [] empClass;
		
		salary 		= new double[numEmp];
		empClass 	= new String[numEmp];
		

		 //Ask user for the Salary for each emp
		for(int i=0; i<salary.length; i++) {
			salary[i] 	= Double.parseDouble(JOptionPane.showInputDialog(
								"Please enter the salary for employee "+(i+1)));
			empClass[i] = JOptionPane.showInputDialog(
								"Enter the employee classification: ");
			System.out.println("Employee "+ (i+1) + " - " + empClass[i] + ": " + salary[i]);
			sum = sum + salary[i];
			
		}
			
		//println for each salary entered
		//for(int i=0; i<salary.length; i++)
			
		
		//Add the salaries to calculate the average
		//double sum = 0;
//		for(int i=0; i < salary.length; i++) {
//			sum = sum + salary[i];
//		}
		
		//Calculate the average
		double avgSal=sum/salary.length;
		System.out.println("Average: " + avgSal);
		
//		salary[0] = 112.0;
//		salary[1] = 217.25;
//		salary[2] = 75.32;
		

		
		
		//Shallow copy
		
//		double [] newSalary;
//		newSalary = salary;
//		newSalary[2] = 15;
//		
//		//Deep Copy
//		newSalary = new double[salary.length];
//		newSalary[0] = salary [0];
//		newSalary[1] = salary [1];
//		newSalary[2] = salary [2];
		
		
	}

}
