package main;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class X extends JFrame{
	JLabel AL,BL;
	JTextField ATF, BTF;
	JButton AB, BB;
	ABButtonHandler aBButtonHandler;
	
	private class ABButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String BBValue;
			BBValue=ATF.getText() + ", " + BTF.getText();
			BTF.setText(BBValue);
		}
	}
	
	public X() {
		setTitle("X Window");
		setSize(200,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container XWindowPane = getContentPane();
		XWindowPane.setLayout(new GridLayout(3,2));
		
		
		AL = new JLabel ("A");
		BL = new JLabel ("B");
	}
	
}	




