package examSix;

public class ExamSix {
	private int a, b, s;
	
	public final static int B = 10;
	
	public ExamSix(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public ExamSix(int a) {
		this(a,B);
	}
	
	public ExamSix(ExamSix e) {
		this.a=e.a;
		this.b=e.b;
		
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
