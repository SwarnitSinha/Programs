1905. Count Sub Islands "https://leetcode.com/problems/count-sub-islands/"

  Logic: Destroy the whole island in grid2 and check if any of the land not present in 1st grid
  
  If any land which present in island of grid2 and not present in GRID1
  then we will not consider it.
    
    class Solution {
    public boolean recurseIsland(int row,int col, int[][] grid1, int[][] grid2){
        //destroy the island of grid2 then conclude.
        
        boolean ans = true;
        
        //go in four direction
        
        if(row>=0 && col>=0 && row<grid1.length && col<grid1[0].length && grid2[row][col] == 1){
            if(grid1[row][col]!=1) ans = false;
            grid2[row][col] = 0;
        
            boolean up = recurseIsland(row-1,col,grid1,grid2);
            boolean down = recurseIsland(row+1,col,grid1,grid2);
            boolean left = recurseIsland(row,col-1,grid1,grid2);
            boolean right = recurseIsland(row,col+1,grid1,grid2);
        
            if(!left || !right || !up || !down) return false;
        }
        return ans;
    }
    
    public int countSubIslands(int[][] grid1, int[][] grid2){
        //all the land in grid2 present in island of grid1

        //recursion
        int count = 0;
        for(int i =0;i<grid2.length;i++){
            for(int j =0;j<grid2[0].length;j++){
                if(grid2[i][j] != 0){
                    // System.out.println(i+" "+j);
                    if(recurseIsland(i,j,grid1,grid2)){
                        //if this island is a part of grid1 or not
                        count++;
                        // System.out.println(i+" "+j);
                    }
                }
                
            }
        }
        return count;
        
    }
}
