class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int m = mat.length;        // rows in original matrix
        int n = mat[0].length;     // columns in original matrix

        // Check if reshape is possible
        if (m * n != r * c) {
            return mat;
        }

        int[][] res = new int[r][c];
        int idx = 0;   // linear (1D) index

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                // map 1D index to new 2D position
                res[idx / c][idx % c] = mat[i][j];
                idx++;
            }
        }
        return res;
    }
}
