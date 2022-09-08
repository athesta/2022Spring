package Sandbox;

import javax.swing.JOptionPane;

public class DIYActivityLesson3_1 {

//	public static void displaySum(double sum) {
//		JOptionPane.showMessageDialog(null, "The sum is "+sum+".", null, JOptionPane.INFORMATION_MESSAGE);
//	}

	/*
	 * This method will find the sum of n consecutive numbers. 
	 * PRE: x will contain a value entered by the user in the main method.
	 * POST: Method will return the sum of the numbers as 'sum'. 
	 */
	public static int findanddisplaysum(int x) {
		int sum = 0;
		for (int i=0; i<=x; i++) {
			sum=sum+i;
			}
		return sum;
	}
	
	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
		int sum = findanddisplaysum(n);
		JOptionPane.showMessageDialog(null, "The sum is " + sum + ".");
	}

}
