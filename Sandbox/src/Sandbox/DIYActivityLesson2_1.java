

package Sandbox;

import java.lang.*;
import javax.swing.*;

public class DIYActivityLesson2_1 {
	public static void main(String[] args) {
		
		double solution;		
		String value = JOptionPane.showInputDialog("Today's math problem is:"
													+ "\n   sin("+"\u03c0"+"/4) - log(x)"
													+"\nEnter a value for x.");
		double x 	 = Double.parseDouble(value);//convert to double
		solution 	 = Math.sin((Math.PI/4)) - Math.log(x);
				
		JOptionPane.showMessageDialog(null, x=solution,"Solution", JOptionPane.INFORMATION_MESSAGE);
		
		

}
}	
