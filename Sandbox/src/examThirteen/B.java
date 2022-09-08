package examThirteen;

public class B extends A{
	private int b;
	
	public B (int a, int b) {
		super(a);
		this.b = b;
	}
	
	public B() {
		this(0,0);
	}
	
	public int f(int x) {
		return super.f(x)*b;
	}
	
	public int f(int x, int y) {
		return y * super.f(y);
	}
	 
	

}
