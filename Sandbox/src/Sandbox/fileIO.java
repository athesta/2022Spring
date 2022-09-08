package Sandbox;
import java.util.*;

import javax.swing.JOptionPane;

import java.io.*;
public class fileIO {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner inFile = new Scanner(new FileReader("employeeData.txt"));
		
		
		
		String firstName; 
		String lastName;
		String str;
		
		double hoursWorked;
		double payRate;
		double wages;
		
		firstName = inFile.next();
		lastName = inFile.next();
		hoursWorked = inFile.nextDouble();
		payRate = inFile.nextDouble();
		wages = hoursWorked*payRate;
		
		inFile.close();
		
		str = firstName + " " + lastName + " " + hoursWorked + " " + payRate + " " + wages;
		
		JOptionPane.showMessageDialog(null, str);
		
	}

}
