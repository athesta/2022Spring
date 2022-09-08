package examThirteen;

public class test{

public static void main(String[] args) {
	A m = new A(5);
	System.out.println(m);
}


}

class A {

    protected int a;

    public A() {
    	a = 1;
    	}

    public A(int a) { 
    	this.a = a;
    	}

    public int f( int x) {
    	return a*x;
    	}

}



class B extends A{

    protected int b;

    public B(){
    	super(2); b = 2; 
    	}

    public B(int b) {
    	super(b); this.b = b;
    	}

    public int f( int x) {
    	return a*b*x;
    	}

} 



class C extends B{

    private int c;

    public C() {
    	super(3); c = 3;
    	}

    public int f( int x) {
    	return a*b*c*x;
    	}
}
