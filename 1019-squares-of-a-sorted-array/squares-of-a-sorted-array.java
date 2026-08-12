class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int k = j;
        int[] sqarr = new int[nums.length];

        while (i<=j){
            int isq = nums[i] * nums[i];
            int jsq = nums[j] * nums[j];
            if(isq > jsq){
                sqarr[k--]=isq;
                i++;
            }
            else{
                sqarr[k--]=jsq;
                j--;
            }
            
        }
           return sqarr;
    }
 
}