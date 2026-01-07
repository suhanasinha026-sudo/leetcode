class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int bottom=matrix.length-1;
        int right=matrix[0].length-1;
        int top=0;
        int left=0;
        List<Integer> spiral = new ArrayList<>();
        
        while( top<=bottom && left<=right){
        //left to right
        for( int i=left; i<=right; i++)
        {
            spiral.add(matrix[top][i]);
        }  
        top++;
        //top to bottom
        for(int i=top; i<=bottom; i++ )
        {
            spiral.add(matrix[i][right]);
        }
        right--;
        if(top <= bottom)
        {
        //right to left
            for(int i=right; i>=left; i-- )
            {
                spiral.add(matrix[bottom][i]);
            }
            bottom--;
        }
        if(left <= right)
        {
            //down to up
            for(int i=bottom; i>=top; i--)
            {
                spiral.add(matrix[i][left]);
            }
            left++;
        }
        }
        return spiral;
    }
}