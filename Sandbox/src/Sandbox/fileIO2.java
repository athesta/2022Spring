package Sandbox;

import java.io.*;

public class fileIO2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter outFile;
		
		outFile = new PrintWriter("Jen.txt");
		outFile.println("Hello File!");	
		
		outFile.close();
		
	}

}
