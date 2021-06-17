class Solution {
    public boolean isPalindrome(int x) {
        
        if(x< 0) return false;
        
        
        int n = 1;
        int y = x;
        
        while(y/10 > 0){
            n *= 10;
            
            y /= 10;
            
        }
        
        int m = 0;
        int j = x;
        while(x > 0){
            
            int r = x %10;
            r *= n;
            m += r;
            x =x/10;
            n = n/10;
        }
        
        return (j == m);
    }
}