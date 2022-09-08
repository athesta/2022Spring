import javax.swing.JOptionPane;

import studentAPI.*;
public class mainStudent {
	

	
	
	
	public static void main(String[] args) {
	Student [] grades;
	
	int num = Integer.parseInt(JOptionPane.showInputDialog("How many students are there?"));
	StudentList.initialSize(num);
	grades = new Student[num];
	String tempName;
	double tempScore;
	char tempGrade;
	String findName;
	
	for (int i = 0; i <grades.length; i++){
		tempName = JOptionPane.showInputDialog
				   (null, "Please enter student " + (i+1) + " name","Student "+ (i+1),JOptionPane.QUESTION_MESSAGE);
		tempScore = Double.parseDouble(JOptionPane.showInputDialog
				   (null,"Please enter test score for Student " + (i+1),"Student "+ (i+1),JOptionPane.QUESTION_MESSAGE));
		tempGrade = JOptionPane.showInputDialog
				   (null,"Please enter grade (A,B,C,D,F) for Student " + (i+1),"Student "+ (i+1),JOptionPane.QUESTION_MESSAGE).charAt(0);
		
		grades[i] = new Student(tempName, tempScore, tempGrade);
	}
	
	for (int i = 0; i <grades.length; i++){		
		System.out.println(grades[i]);
	}
	double average=Student.AverageScore(grades);
	System.out.println("Average Score is: "+average);
	Student.aboveAvg(grades, average);
	
	findName = JOptionPane.showInputDialog("Enter a name of a student you'd like to find in the array.");
	
	Student.findStudent(grades,findName);
	
	
	
	StudentList.addStudent(findName, num, tempGrade);
}

	
	
}

