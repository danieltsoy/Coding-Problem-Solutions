/**
 * https://leetcode.com/problems/valid-sudoku/
 * Problem 36. Valid Sudoku
 * @danieltsoy
 */
public class ValidSudokuSolution {
    public boolean isValidSudoku(char[][] board) {
       
	   boolean answer = false; 
       
	   if(checkBoard(board)){
          answer = true;
       } 
	   
       boolean answer2 = true;
	   
       for (int counter = 0; counter < 9; counter += 3){
           for(int counterY = 0; counterY < 9; counterY +=3){
              char[][] tempBoard = new char[3][3];
               for(int i = 0; i < 3;i++){
                 for(int j = 0; j < 3;j++){
                    tempBoard[i][j] = board[i + counter][j + counterY];
                 }
            }
            //System.out.println(Arrays.deepToString(tempBoard));
            if(!checkSubBoard(tempBoard)){
                  answer2 =  false;               
            }                    
          }  
       }
        
    if(answer && answer2){
             return true;
         }       
         else{
             return false;
         }     
    }
    
    public boolean checkSubBoard(char[][] board) { 
        boolean[] isVisited = new boolean[9];
        for(int i = 0; i < board.length; i++){ 
            for(int j = 0; j < board.length; j++) { 
                if(board[i][j] != '.') { 
                    if(isVisited[Character.getNumericValue(board[i][j])-1]) {
                        return false; 
                    } else { 
                        isVisited[Character.getNumericValue(board[i][j])- 1] = true;  
                    }
                }                
            }
        }
        return true; 
    }
   
    public boolean checkBoard(char[][] board){
    for(int i = 0; i < board.length; i++){
     boolean[] isVisited = new boolean[9];
        for(int j = 0; j < board.length; j++){
            if (Character.getNumericValue(board[i][j]) != -1 ) {
                if(isVisited[Character.getNumericValue(board[i][j] ) - 1]){
                    return false;
                } else {
                    isVisited[Character.getNumericValue(board[i][j])- 1] = true; 
                  }
            }
        }
    }
    
    for(int j = 0; j < board.length; j++){
         boolean[] isVisited = new boolean[9];
        for(int i = 0; i < board.length; i++){
            if (Character.getNumericValue(board[i][j]) != -1 ) {
                if(isVisited[Character.getNumericValue(board[i][j]) - 1]){
                    return false;
                } else {
                    isVisited[Character.getNumericValue(board[i][j]) - 1] = true; 
                  }
            }
        }
    }
    return true; 
    }
}