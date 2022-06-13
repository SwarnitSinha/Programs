class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i =0;i<9;i++){
            for(int j = 0;j<9;j++){
                
                if(board[i][j]!='.'){
                    if(!check(board,i,j)) return false;
                }
                
            }
        }
        return true;
    }
    public boolean check(char[][] mat , int row, int col){
        
        for(int i =0;i<9;i++){
            
            //horizontal
            if(i!=col&&mat[row][i]==mat[row][col])return false;
            
            //vertical
            if(i!=row&&mat[i][col]==mat[row][col])return false;
            
            //for block check
            int x = 3 * (row / 3) + i / 3;                            => Great way to look for element in the 3 * 3 block of a SUDOKU
            int y = 3 * (col / 3) + i % 3;
            if ((x!=row&&y!=col)&&mat[x][y] == mat[row][col] )
                return false;
            
        }
        return true;
        
    }
}
