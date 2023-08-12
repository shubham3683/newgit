package com.learn_7.code;

public class validSudoko {
	 final static int MAX_SIZE = 9;
	 //final static char help='';
	 private static boolean isPresentInRow(int row,int cols, String value){
	        // IN a Row Traverse in Each Col
	        for(int col = cols+1; col<MAX_SIZE; col++){
	            if(board[row][col] == value){
	                return true;
	            }
	        }
	        return false; 
	    }
	  private static boolean isPresentInCol(int rows,int col, String value){
	        // IN a Row Traverse in Each Col
	        for(int row = rows+1; row<MAX_SIZE; row++){
	            if(board[row][col] == value){
	                return true;
	            }
	        }
	        return false; 
	    }

	  private static boolean isPresentInSubGrid(int row, int col, String value){
	        int startRow = row - row % 3;
	        int startCol = col - col % 3;
	        for(int i = startRow; i<startRow+3; i++){
	            for(int j= startCol; j<startCol+3; j++){
	                if(board[i][j]==value && i!=row && j!=col){
	                    return true;
	                }
	            }
	        }
	        return false;
	    }
	static boolean validSudokoo(String[][] board) {
		for(int row=0;row<MAX_SIZE;row++) {
			for(int col=0;col<MAX_SIZE;col++) {
				if(board[row][col]!=".") {
					if((isPresentInRow(row,col,board[row][col]) || isPresentInCol(row,col,board[row][col]) || isPresentInSubGrid(row,col,board[row][col]) )) {
						return false;
					}
				}
				
			}
		}
		return true;
	}
	static String[][] board=
		{{"8","3",".",".","7",".",".",".","."}
					,{"6",".",".","1","9","5",".",".","."}
					,{".","9","8",".",".",".",".","6","."}
					,{"8",".",".",".","6",".",".",".","3"}
					,{"4",".",".","8",".","3",".",".","1"}
					,{"7",".",".",".","2",".",".",".","6"}
					,{".","6",".",".",".",".","2","8","."}
					,{".",".",".","4","1","9",".",".","5"}
					,{".",".",".",".","8",".",".","7","9"}};
	public static void main(String[] args) {
		 System.out.println(validSudokoo(board));
	}
}
