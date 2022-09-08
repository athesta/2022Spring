
package Sandbox;
import examFive.*;
public class ExamFive {

	public static void main(String[] args) {
		Exam e1, e2;
		
		e1=new Exam();
		e2=new Exam();

		e1.initializeExam(5, 7);
		e2.initializeExam(3);
		
		e1.findS();
	}

}
