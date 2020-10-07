//1413


class Solution {
    public int minStartValue(int[] nums) {

        int least = 0;
        int sum = 0;
        for(int i = 0 ;i < nums.length; i++){

            // less = Math.min(nums[i], less+nums[i]);
           //  least = Math.min(least, less);

            sum += nums[i];
            if(least > sum ) least = sum;

        }

        if(least > 0) return 1;

        return (1+Math.abs(least));
    }
}
