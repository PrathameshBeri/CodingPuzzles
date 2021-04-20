//231
class Solution {
    public boolean isPowerOfTwo(int n) {

     if(n == 1 || n == 2){
         return true;
     }
        if(n == 0) return false;

        int b = 1;

        while( n > 0 ){

            if(n % 2 != 0) return false;
            if(n == 2) return true;
            n = n/2;
        }

        return false;
    }
}
