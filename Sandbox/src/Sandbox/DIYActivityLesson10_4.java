package Sandbox;

import javax.swing.JOptionPane;

public class DIYActivityLesson10_4 {
	
	public static int addTwoArrays(int [] y, int [] z, int numElem) {
		int sum = 0;
		for(int i = 0; i < numElem; i++) {
			sum += y[i];
		}
		for(int i = 0; i < numElem; i++) {
			sum += z[i];
		}
				
		return sum;
		
	}
		
	public static void main(String[] args) {
		int []a1;
		int []a2;
		int Elem;
		int sumElem;
		
		Elem = Integer.parseInt(JOptionPane.showInputDialog("Enter the # of elements in each array."));
		
		a1 = new int[Elem];
		a2 = new int[Elem];
		
		for(int i = 0; i < Elem; i++)
			a1[i] = Integer.parseInt(JOptionPane.showInputDialog("Array 1 - Enter element " + (i+1)));
		
		for(int i = 0; i < Elem; i++)
			a2[i] = Integer.parseInt(JOptionPane.showInputDialog("Array 2 - Enter element " + (i+1)));
		
		sumElem = addTwoArrays(a1,a2,Elem);
		
		JOptionPane.showMessageDialog(null,"The sum of all elements is " + sumElem);

		
	
		
				

	}

}
