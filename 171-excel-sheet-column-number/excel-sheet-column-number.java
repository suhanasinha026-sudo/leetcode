class Solution {
    public int titleToNumber(String columnTitle) {
        int b=0,n=columnTitle.length(),c=0;
        char a='\0';
        int ncopy=n;
        for(int i=0; i<n; i++){
            
            a=columnTitle.charAt(i);
             b=(int)a - 64;
            c += b * Math.pow(26,ncopy-1);
            ncopy--;
        }
        return c;
    }
}