package bmiCalculator;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class AppWindow extends JFrame {
	final private int DEFAULT_WIDTH = 600;
	final private int DEFAULT_HEIGHT = 300;
	final private String DEFAULT_TITLE = "BMI Calculator";
		
	JLabel weightLabel;
	JTextField weightField;
	JLabel heightFeetLabel;
	JTextField heightFeetField;
	JLabel heightInchLabel;
	JTextField heightInchField;
	JLabel bmiCalcLabel;
	JTextField bmiCalcField;
	JButton computeBMIButton;
	JButton quitButton;
	

	private class QuitButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
			
		}
	}
	
	protected class ComputeBMIButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			double bmi, feet, inches, weight;
			int num = 703;
			String bmiString;
			
			weight = Double.parseDouble(weightField.getText());
			feet = Double.parseDouble(heightFeetField.getText());
			inches = Double.parseDouble(heightInchField.getText());
			
			inches = inches + feet*12;
			
			bmi = (num*weight)/(inches*inches);
			bmiString = String.format("%.2f", bmi);
			bmiCalcField.setText(bmiString);
			
			if (bmi < 18.5) {
				bmiCalcLabel.setText("BMI => Underweight: ");
				bmiCalcField.setBackground(Color.pink);
			}
			else if (bmi < 25) {
				bmiCalcLabel.setText("BMI => Normal weight: ");
				bmiCalcField.setBackground(Color.green);
			}
			else if (bmi < 30) {
				bmiCalcLabel.setText("BMI => Overweight: ");
				bmiCalcField.setBackground(Color.MAGENTA);
			}
			else {bmiCalcLabel.setText("BMI => Obese: ");
			bmiCalcField.setBackground(Color.RED);}
		}
	}
	
	public AppWindow() {
		Container window;
		setTitle(DEFAULT_TITLE);
		
		window = getContentPane();
		window.setLayout(new GridLayout(5,2));
		
		weightLabel 	= new JLabel("Weight (pounds): ", SwingConstants.RIGHT);
		weightField 	= new JTextField(10);
		heightFeetLabel = new JLabel("Height (feet): ", SwingConstants.RIGHT);
		heightFeetField = new JTextField(10);
		heightInchLabel = new JLabel("Height (inches): ", SwingConstants.RIGHT);
		heightInchField = new JTextField(10);
		bmiCalcLabel = new JLabel("BMI: ", SwingConstants.RIGHT);
		bmiCalcField 	= new JTextField(10);
		computeBMIButton = new JButton("Compute BMI");
		quitButton = new JButton("Quit");
		
		
		

		

		window.add(weightLabel);
		window.add(weightField);
		window.add(heightFeetLabel);
		window.add(heightFeetField);
		window.add(heightInchLabel);
		window.add(heightInchField);
		window.add(bmiCalcLabel);
		window.add(bmiCalcField);
		window.add(computeBMIButton);
		window.add(quitButton);
		
		QuitButtonHandler quitButtonHandler = new QuitButtonHandler();
		quitButton.addActionListener(quitButtonHandler);
		
		ComputeBMIButtonHandler computeButtonHandler = new ComputeBMIButtonHandler();
		computeBMIButton.addActionListener(computeButtonHandler);
		
		
		
		
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
}
