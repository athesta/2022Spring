

package rectangleProject;

import javax.swing.JOptionPane;

import rectangle.*;

public class mainRectProgram {

	public static void main(String[] args) {
		 
		
		double y = 10;
		Rectangle a1 = new Rectangle(10,20);
		Rectangle a2 = new Rectangle(y);
		Rectangle a3 = new Rectangle(); 
		a1.computeArea();
		a2.computeArea();
		a3.computeArea(); 
		JOptionPane.showMessageDialog(null, "Rectangle 1\n " + a1);
		JOptionPane.showMessageDialog(null, "Rectangle 2\n " + a2);
		JOptionPane.showMessageDialog(null, "Rectangle 3\n " + a3);
//		System.out.println("A1 Area; Expected = 200; Actual: " + a1.getArea() 
//							+"\nA2 Area; Expected = 50; Actual: " + a2.getArea()
//							+"\nA3 Area; Expected = 25; Actual: " + a3.getArea());
		

//		Rectangle rect1 = new Rectangle(10,20);
//		Rectangle rect2;
//		//shallow copy
//		rect2 = rect1;
//		rect2.setWidth(20);
//		rect1.computeArea();
//		rect2.computeArea();
//		System.out.println("\nShallow Copy: "
//						 + "\nRect1 Area; Expected = 400; Actual: " + rect1.getArea());
//		System.out.println("Rect2 Area; Expected = 400; Actual: " + rect2.getArea());
//		
//		//deep copy
//		Rectangle rect3 = new Rectangle(10,20);
//		Rectangle rect4;
//		rect4 = new Rectangle(rect3);
//		rect4.setWidth(20);
//		rect3.computeArea();
//		rect4.computeArea();
//		System.out.println("\nDeep Copy:"
//						 + "\nRect3 Area; Expected = 200; Actual: " + rect3.getArea());
//		System.out.println("Rect4 Area; Expected = 400; Actual: " + rect4.getArea());
		
	}

}
