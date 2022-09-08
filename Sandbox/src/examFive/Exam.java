package examFive;

public class Exam {

	private int a, b, s;
	
	public static int B = 10;
	
	public void initializeExam(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void initializeExam(int a) {
		this.a=a;
		this.b=B;
	}
	
	public void findS() {
		s = a+b;
	}
	
	public int getB() {
		return b;
	}
	
	public void setB(int b) {
		this.b = b;
	}
}
