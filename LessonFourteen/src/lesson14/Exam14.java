package lesson14;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class Exam14 extends JFrame {
	JLabel AL, BL;
	JTextField ATF, BTF;
	JButton AB, BB;
	ABButtonHandler aBButtonHandler;
	
	private class ABButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String BBValue;
			BBValue = ATF.getText() + ", " + BTF.getText();
			BTF.setText(BBValue);
		}
	}
	
	public Exam14() {
		setTitle("X Window");
		setSize(200,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container XWindowPane = getContentPane();
		XWindowPane.setLayout(new GridLayout(3,2));
		
		AL = new JLabel("A");
		BL = new JLabel("B");
		
		ATF = new JTextField(10);
		BTF = new JTextField(10);
		
		AB = new JButton("AB");
		BB = new JButton("BB");
		
        XWindowPane.add(AL);

        XWindowPane.add(BL);

        XWindowPane.add(ATF);

        XWindowPane.add(BTF);

        XWindowPane.add(AB);

        XWindowPane.add(BB);
        
       ATF.setText("Enter A");
       BTF.setText("Enter B");
		
        aBButtonHandler = new ABButtonHandler();
        AB.addActionListener(aBButtonHandler);
        setVisible(true);
        
	}

}
