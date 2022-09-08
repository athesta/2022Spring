package Sandbox;

public class DIYActivityLesson9_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] w = {10, 21, 40, 40};
		int[] x = {10, 20, 30, 40};
		int[] y = {10, 21, 40, 40};
		int[] z = x;
		boolean IsEqual;
		
		IsEqual = (x.length == w.length); //assume true if the length of the array is equal and false otherwise
		for(int i = 0; i<x.length && IsEqual; i++)
			IsEqual = (x[i] == w[i]);
		
		if(IsEqual)
			System.out.println("Elements of X and W are the same");
		else
			System.out.println("Elements of X and W are Not the same");	
		
		IsEqual = (x.length == y.length); //assume true if the length of the array is equal and false otherwise
		for(int i = 0; i<x.length && IsEqual; i++)
			IsEqual = (x[i] == y[i]);
		
		if(IsEqual)
			System.out.println("Elements of X and Y are the same");
		else
			System.out.println("Elements of X and Y are Not the same");	
		
		IsEqual = (x.length == z.length); //assume true if the length of the array is equal and false otherwise
		for(int i = 0; i<x.length && IsEqual; i++)
			IsEqual = (x[i] == z[i]);
		
		if(IsEqual)
			System.out.println("Elements of X and Z are the same");
		else
			System.out.println("Elements of X and Z are Not the same");	
		
		
		
		
	}
}
		
		
		
		
		

