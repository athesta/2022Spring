package Sandbox;

import java.util.Arrays;

public class chess {
	
	public static int countPawns( String [][]a ) {
		String wp = "White Pawn";
		int count = 0;
		
		for (int i =0; i< a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				boolean equal = wp.equals(a[i][j]);
				if (equal) {
					count++;
				}
			}
		}
		return count;
		}
			
	
	public static void main(String[] args) {
		String [][] Chess;
		Chess = new String [8][8];
			
		String bl = "Black";
		String wh = "White";
		String ro = "Rook";
		String kn = "Knight";
		String bi = "Bishop";
		String qu = "Queen";
		String ki = "King";
		String pa = "Pawn";
		
		
		Chess[0][0] = bl+" "+ro;
		Chess[0][1] = bl+" "+kn;
		Chess[0][2] = bl+" "+bi;
		Chess[0][3] = bl+" "+qu; 
		Chess[0][4] = bl+" "+ki; 
		Chess[0][5] = Chess[0][2]; 
		Chess[0][6] = Chess[0][1]; 
		Chess[0][7] = Chess[0][0]; 
		Arrays.fill(Chess[1], bl + " " + pa);
		
		Chess[7][0] = wh+" "+ro;
		Chess[7][1] = wh+" "+kn;
		Chess[7][2] = wh+" "+bi;
		Chess[7][3] = wh+" "+qu; 
		Chess[7][4] = wh+" "+ki; 
		Chess[7][5] = Chess[0][2]; 
		Chess[7][6] = Chess[0][1]; 
		Chess[7][7] = Chess[0][0]; 
		Arrays.fill(Chess[6], wh + " " + pa);
		

		 
		for (String[] row: Chess)
		{
		    if (row != null)
		    {
		        for (String col: row) {
		            System.out.print(col + " ");
		        }
		    }
		    System.out.println();
		}		
		
		int pawnCount;
		pawnCount = countPawns(Chess);
		System.out.println(pawnCount);

	}

}
