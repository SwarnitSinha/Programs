class Solution {
    
    public void solveHelper(char[][] mat, int row, int n,
                           List<List<String>> ans){
        //base case
        if(row==n){
            //add into ans;
            //matrix is ready
            List<String> temp = new ArrayList<>();
            for(int i =0;i<n;i++){
                String s = new String(mat[i]);
                temp.add(new String(s));
            }
            ans.add(new ArrayList(temp));
          
        }
        
        for(int col = 0;col<n;col++){  
            if(isPossible(mat,row,col)){
                mat[row][col] = 'Q';
                solveHelper(mat,row+1,n,ans);
                mat[row][col] = '.';
            }
        }
    }
    
    public boolean isPossible(char[][] mat,int row,int col){
        
        for(int j = col,i = 0;i<mat.length;i++){
            if(mat[i][j]=='Q')return false;
        }
        
        //check for diagonals
        //upper left diagonal
        for(int i =row,j=col;i>=0&&j>=0;i--,j--){
          
            if(mat[i][j]=='Q') return false;
            
        }
        
        //upper right diagonal
        for(int i = row,j=col;i>=0&&j<mat.length;i--,j++){
            
            if(mat[i][j]=='Q') return false;
            
        }
        
        //we don't have to check in the same row.
        
        //we do not need to check in bottom columns 
        //because we are coming from up to down
   
        return true;
    }
    
    public List<List<String>> solveNQueens(int n) {
        
        List<List<String>> ans = new ArrayList<>();
        int q = 0;
        char mat[][]  = new char[n][n];
      
        for(int i =0;i<mat.length;i++){
            for(int j = 0;j<mat.length;j++){
                mat[i][j] = '.';
            }
        }
      
        solveHelper(mat,0,n,ans); //2nd argument is starting row
      
        return ans;  
    }
}
