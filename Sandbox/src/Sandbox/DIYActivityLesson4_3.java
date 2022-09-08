package Sandbox;

public class DIYActivityLesson4_3 {
	public static int findSum(int a, int b) {
		return(a+b);
	}
	
	public static double findSum(int a, int b, int c) {
		return(a+b+c);
	}
	
	public static int findSum(int a, int b, int c, int d) {
		return(a+b+c+d);
	}
	
	public static void main(String[] args) {
	    int x=1;
	    int y=2;
		
	    int Sum1 	= findSum(1, 2);
	    double Sum2 = findSum(4, 5, x);
	    int Sum3 	= findSum(10, x, 6, y);	
		System.out.println(Sum1);
		System.out.println(Sum2);
		System.out.println(Sum3);
	}
	
}
//int f(int x, char c){ ... } - Source

//int f(int x){ ...} - Correct
//int f(char x, int c){ ... } - Correct
//double f(int x, char c);-Incorrect
//double f(int x String s);-Correct
//int f(int x, char c, String s);-Correct
//int f(int a, char b);-Incorrect
//int newf(int x, char c, String z);-Correct