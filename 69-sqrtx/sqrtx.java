class Solution {
    public int mySqrt(int x) {
        // if x is 0 or 1, return x directly
        if (x < 2) {
            return x;
        }

        int left = 1;
        int right = x;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;

            if (square == x) {
                return mid;      // found exact square root
            }

            if (square < x) {
                ans = mid;       // mid is a valid sqrt-floor candidate
                left = mid + 1;  // try to find a bigger one
            } else {
                right = mid - 1; // mid is too big
            }
        }

        return ans;  // floor(sqrt(x))
    }
}
