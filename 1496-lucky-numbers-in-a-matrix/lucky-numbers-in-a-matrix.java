class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {

        int r = matrix.length;
        int c = matrix[0].length;

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < r; i++) {

            // Step 1: find minimum in the row
            int min = matrix[i][0];
            int colIndex = 0;

            for (int j = 1; j < c; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    colIndex = j;
                }
            }

            // Step 2: check if it's maximum in its column
            boolean isLucky = true;
            for (int k = 0; k < r; k++) {
                if (matrix[k][colIndex] > min) {
                    isLucky = false;
                    break;
                }
            }

            // Step 3: add if lucky
            if (isLucky) {
                ans.add(min);
            }
        }

        return ans;
    }
}
