//313


class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {

        int i = 1;
        int count = 0;
        int ans = checkUgly(primes, n);
        return ans;
    }

    public int checkUgly(int[] primes,int n){

        int[] nos = new int[n];
        nos[0] = 1;
        int s = primes.length;
        int[] pos = new int[s];
        int mul;
        int min = primes[0];
        for(int i = 1; i < n; i++){


            int minp = 0;
            min = Integer.MAX_VALUE;
            for(int j = 0; j < s; j++){
                mul = primes[j] * nos[pos[j]];


                if(min > mul)
                {

                 min = mul;
                minp = j;

                }
            }

            nos[i] = min;
          for(int m = 0 ; m < s; m++){
              if(min == primes[m] * nos[pos[m]]){
                 pos[m] = pos[m]+1;
              }
          }


        }
        return nos[n-1];



    }
}
