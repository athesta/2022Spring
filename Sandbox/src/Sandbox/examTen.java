package Sandbox;

import javax.swing.JOptionPane;

public class examTen {
//	  public static int[] displayScores(int[]scores, int numScores){
//	       for (int i = 0; i < numScores; i++) { 
//	    	  System.out.println(scores[i] + " ");
//	      }
//		return scores;
//	            
//	  }
//	
	
	  public static void displayScores(int[] scores, int numScores ) {
	      for (int i=0; i<numScores; i++){
	    	  System.out.print(scores[i]);
	      }
	   }
	  
	  public static int[] pairwiseAdd(int[]a1,int[]a2) {
		  int n = a1.length;
		  int[] r = new int[n];
		  for(int i=0;i<n;i++)
			  r[i]=a1[i]+a2[i];
		   return r;
		  
	  }
	  
	  public static void main(String[] args) {
		  int [] exam1Scores = {1, 2, 3, 4, 5};
		  displayScores(exam1Scores,5);
		  
		  int [] z;
		  
		  
		  
	  }

}
