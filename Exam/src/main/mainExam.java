package main;

public class mainExam {

	public static void funCall(int x, String y, StringBuffer z) {
		int w;
		w=3;
		x=10;
		y= " nice ";
		z.append(" nice ");
		
	}

	
	public static void main(String[] args) {
	int one;
	String two;
	StringBuffer three;
	one = 3;
	two = "be";
	three = new StringBuffer("be");
	funCall(one,two,three);
	}
	
	
}
