//264
import java.util.*;
class Solution {
    public int nthUglyNumber(int n) {
        int i = 1;
        int count = 0;
        int ans = checkUgly(new int[n]);
        return ans;
    }

    public int checkUgly(int[] nos){
        int n = nos.length;
        if(n < 7  && n > 0) return n;

        nos[0] = 1;
        int twomul;
        int threemul;
        int fivmul;
        int twopos = 0;
        int threepos = 0;
        int fivepos = 0;



        for(int i = 1; i < n; i++){

             twomul = nos[twopos]* 2;
             threemul = nos[threepos] * 3;
             fivmul = nos[fivepos]* 5 ;

            int min = Math.min(Math.min(twomul, threemul), fivmul);
            nos[i] = min;
            if(min == twomul) twopos++ ;
            if(min == threemul) threepos++;
            if(min == fivmul) fivepos++;

        }
        return nos[n-1];


    }
}
