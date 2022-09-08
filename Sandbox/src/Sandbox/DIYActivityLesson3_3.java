package Sandbox;

import javax.swing.JOptionPane;

public class DIYActivityLesson3_3 {

	
	public static void userInstruct() {
	//Display a dialog w/ program definition to the user
	//PRE: None
	//POST: None
		JOptionPane.showMessageDialog(null, "This program will give you the average of 3 numbers.");
	}
	
	public static double getValue() {
	//Get Values for calculating the average
	//PRE: None
	//POST: will return a numeric value, type of double 
		double value;
		value = Double.parseDouble(JOptionPane.showInputDialog("Enter a numeric value."));
		return (value);
	}
	
	public static double average(double a,double b,double c) {
	//Will use values entered to calculate an average 
	//PRE: 3 values - type double
	//POST: will return the average - type double
		double avg;
		double x = a;
		double y = 2*b;
		double z = a+b+c;
		avg = (x+y+z)/3;
		return (avg);
		
	}
	
	public static void msg(double avg) {
	//Will display the values and their average to the user
	//PRE: 3 values - type double, average - type double
	//POST: None
		JOptionPane.showMessageDialog(null, "The average is " + avg +".");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare variables
		double a;
		double b;
		double c;
		double avg;
		
		//Provider users with description of the program
		userInstruct();
		//Get Value 1
		a = getValue();
		//Get Value 2
		b = getValue();
		//Get Value 3
		c = getValue();
		//get the average
		avg = average(a,b,c);
		//display it to the user
		msg(avg);
		
		
	}

}
