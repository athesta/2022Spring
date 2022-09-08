package main;

public class Exam {
	private int a,b,s;
	
	public final static int B = 10;
	
	public void initializeExam(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void initializeExam(int a) {
		this.a=a;
		this.b=B;
	}
	
	public void intializeExam(Exam e) {
		this.a=e.a;
		this.b=e.b;
	}
	
	public void findS() {
		this.s=a+b;
	}

	public int getB() {
		return b;
	}
	
	public void setB(int b) {
		this.b=b;
	}
	
	public String toString() {
		return "a: " + a + ", b: " + b;
}


public static void main (String [] args) {
	Exam e1, e2;
	e1 = new Exam();
	e2 = new Exam();
	e1.initializeExam(5,7);
	e2.initializeExam(3);
	
	System.out.println(e1.toString());
}
}