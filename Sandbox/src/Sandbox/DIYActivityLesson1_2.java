package Sandbox;

import javax.swing.*;
import java.io.*;
import java.util.*;

public class DIYActivityLesson1_2 {

	public static void main(String[] args) throws FileNotFoundException {

		//Declare variables & create/associate the stream objects
		String lastName, firstName, fileName = "SalaryData";
		int salary, employeeCount = 0;

		Scanner inFile 		= new Scanner(new FileReader(fileName + ".txt"));
		PrintWriter outFile = new PrintWriter(fileName + "-out.txt");
		
		/*
		 * While loop using hasNext method to detect the end of the file.
		 * Output will increment employeeCount for each line.  
		 */
		while (inFile.hasNext()) 
		{
			lastName 	= inFile.next();
			firstName	= inFile.next();
			salary 		= inFile.nextInt();

			outFile.printf(++employeeCount 
							+ " " + firstName 
							+ " " + lastName 
							+ " " + salary 
							+ "\n");
		}

		inFile.close();
		outFile.close();

	}

}
