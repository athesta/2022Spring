package Sandbox;
import javax.swing.*;
public class DIYActivityLesson1_1 {
	
	public static void main(String[] args) {

	String hoursStr, rateStr;
	double hours, rate, salary;
	
	hoursStr 	= JOptionPane.showInputDialog("Enter the number of hours worked and press OK.");
	rateStr  	= JOptionPane.showInputDialog("Enter your hourly rate and press OK.");
	
	hours 		= Double.parseDouble(hoursStr);
	rate 		= Double.parseDouble(rateStr);
	
	salary 		= hours * rate;
	

	JOptionPane.showMessageDialog(null, 
								 String.format("Your weekly salary is: $%.2f", salary), 
								 "Weekly Salary", 
								 JOptionPane.INFORMATION_MESSAGE);

	}

}