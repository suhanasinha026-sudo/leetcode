class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        boolean s=false;
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                if(i==j || i+j+1==r)
                {
                    if(grid[i][j]==0)
                    return false;
                    
                }
                else 
                {
                    if(grid[i][j]!=0)
                    return false;
                    
                }
                
            }
        }
    
      return true;  
    }
}