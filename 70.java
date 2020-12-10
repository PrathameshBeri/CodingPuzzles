//70.java

class Solution {
    public int climbStairs(int n) {


       int prev = 0;
        int curr = 1;
        int nex = 0;

        for(int i = 0 ; i < n ; i++ ){

            nex = prev + curr;
            prev = curr;
            curr = nex;

        }
        return nex;
    }
}
