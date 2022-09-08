package main;

public class B extends A{
	private int b;
	public B(int a, int b) {
		super(a);
		this.b=b;
	}
	
	public B() {
		B(0,0);
	}
	
	public int f(int x) {
		return super.f(x)*b;
	}

}
