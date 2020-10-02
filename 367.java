//367

class Solution {
    public boolean isPerfectSquare(int num) {

        if(num == 1 ) return true;
        if(num == 0) return false;
        int c = 1;

        while( c < num ){

            int sq = c*c;

            if(sq == num){
                return true;
            }

            if(sq > num) return false;

            c++;
        }
        return false;
    }
}
