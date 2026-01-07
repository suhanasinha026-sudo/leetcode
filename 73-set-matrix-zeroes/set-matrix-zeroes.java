class Solution {
    public void setZeroes(int[][] matrix) {

        int r = matrix.length;
        int c = matrix[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;

        // 1️⃣ Check first row
        for (int j = 0; j < c; j++) {
            if (matrix[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }

        // 2️⃣ Check first column
        for (int i = 0; i < r; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }

        // 3️⃣ Mark rows & columns (excluding first row & col)
        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0; // row marker
                    matrix[0][j] = 0; // column marker
                }
            }
        }

        // 4️⃣ Set zeros using markers
        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // 5️⃣ Zero first row if needed
        if (firstRowZero) {
            for (int j = 0; j < c; j++) {
                matrix[0][j] = 0;
            }
        }

        // 6️⃣ Zero first column if needed
        if (firstColZero) {
            for (int i = 0; i < r; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
