import java.util.Scanner;
public class dsa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner (System.in);
   int[][] solution = new int [9][9];
   System.out.println("Enter the values of a 9 X 9 Sudoku solution");

   for(int i=0;i<9;i++) {
     for(int j=0;j<9;j++) {
     solution[i][j]=sc.nextInt();
     }
   }
   int t=1;
   for(int row = 0; row < 9; row += 3) {
	   for(int col = 0; col < 9; col += 3) {
	      // row, col is start of the 3 by 3 grid
		   System.out.println("Submatrix " + (t) +" ↓↓");
		   System.out.println(" --------");
	      for(int pos = 0; pos < 3; pos++) {
	    	  System.out.print("| ");
	         for(int pos2 = 0 ; pos2 < 3; pos2++) {
	    	  
	    	  	 System.out.print(solution[row + pos][col + pos2] + " ");

	         }
	         System.out.println(" |");
	    	  }
	      System.out.println(" --------");
	      t++;
	      
	      
	      
	      }
	      
	   }
	}
   
   
   
}
