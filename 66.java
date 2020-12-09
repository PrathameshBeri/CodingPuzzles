//66

class Solution {
    public int[] plusOne(int[] digits) {

        int n = digits.length;

        boolean carryover = true;

        while(carryover && n > 0){

            int k = digits[n-1];

            k+= 1;

            if(k == 10){
                digits[n - 1] = 0;
                n--;
                if(n == 0){
                    int[] digi = new int[digits.length+1];
                    digi[0] = 1;
                    return digi;
                }
            }else{
                digits[n-1] = k;
                carryover = false;
            }

        }

        return digits;
    }
}
