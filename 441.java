//441

class Solution {
    public int arrangeCoins(int n) {
        if(n == 0) return 0;
       if(n <= 2 ) return 1;

        long count = 0;
        for(int i = 0; i < n; i++){
            count += i;
            if(count > n){
                return i-1;
            }
            else if( count == n) return i;

        }

       return -1;
    }


}
