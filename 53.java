//53
class Solution {
    public int maxSubArray(int[] nums) {


        int sum = Integer.MIN_VALUE;
        int curr = 0;

        for(int n : nums){
            curr = Math.max(n, n+curr);
            sum = Math.max(sum, curr);
        }

        return sum;
    }
}
