package lesson14;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Lesson14 extends JFrame {
	final int DEFAULT_WIDTH  = 600;
	final int DEFAULT_HEIGHT = 400;
	final String DEFAULT_TITLE = "Salary Calculator";
	
	private JLabel HoursLabel;
	JTextField hoursField;
	private JLabel PayRateLabel;
	JTextField payRateField;
	private JLabel SalaryLabel;
	JTextField salaryField;
	JButton computeButton;
	JButton quitButton;
	

	
	private class QuitButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}

	private class ComputeButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			double salary, hours, payRate;
			String salaryStr;
			
			hours = Double.parseDouble(hoursField.getText());
			payRate= Double.parseDouble(payRateField.getText());
			
			salary = hours*payRate;
			salaryStr = String.format("%.2f", salary);
			
			salaryField.setText(salaryStr);
		}
	}
	
	
	public Lesson14() {
		Container windowPane;
		setTitle(DEFAULT_TITLE);
		
		windowPane = getContentPane();
		windowPane.setLayout(new GridLayout(4,2));
		JLabel HoursLabel 	= new JLabel("Hours Worked: ", SwingConstants.RIGHT);
		hoursField 			= new JTextField(10);
		JLabel PayRateLabel = new JLabel("Pay Rate: ", SwingConstants.RIGHT);
		payRateField  		= new JTextField(10);
		JLabel SalaryLabel 	= new JLabel("Salary: ", SwingConstants.RIGHT);
		salaryField 		= new JTextField(10);
		computeButton		= new JButton("Compute Salary");
		quitButton 			= new JButton("Quit");

		windowPane.add(HoursLabel);
		windowPane.add(hoursField);
		windowPane.add(PayRateLabel);
		windowPane.add(payRateField);
		windowPane.add(SalaryLabel);
		windowPane.add(salaryField);
		windowPane.add(computeButton);
		windowPane.add(quitButton);
		
		QuitButtonHandler quitButtonHandler = new QuitButtonHandler();
		quitButton.addActionListener(quitButtonHandler);
		
		ComputeButtonHandler computeButtonHandler = new ComputeButtonHandler();
		computeButton.addActionListener(computeButtonHandler);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
		setVisible(true);
		
	
		
	
		
	}




}
