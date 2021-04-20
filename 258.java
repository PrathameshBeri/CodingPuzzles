//258

class Solution {
    public int addDigits(int num) {

        return helper(num);

    }

    public static int helper(int n){

        if(!(n/10 > 0)){
            return n;
        }else{


            int sum = 0;

            while(n > 0){

                sum += n%10;
                n /= 10;

            }

            return helper(sum);
        }
    }
}
