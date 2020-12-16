//136

class Solution {
    public int singleNumber(int[] nums) {


        int d = 0;

        for(int a : nums){
           d ^= a;
        }

        return d;
    }
}
