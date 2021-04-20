//198
class Solution {
    public int rob(int[] nums) {

        if(nums.length ==0) return 0;
        if(nums.length == 1) return nums[0];


        int[] maxAmts = new int[nums.length];


        for(int i = 0; i < nums.length; i++){
            int y = helper(maxAmts, nums, i);
            maxAmts[i] = y;
        }

         Arrays.stream(maxAmts).forEach(x -> System.out.printf(" %d ", x));
        int m1 = Arrays.stream(maxAmts).max().getAsInt();

        return m1;
    }


    public static int helper(int[] opti, int[] nums, int n){

       int max;

        if(n > 2){
            max = Math.max( nums[n] + opti[n -2], nums[n] + opti[n-3]);
        }else if (n > 1){
            max = Math.max(nums[n], nums[n] + opti[n-2]);
        }else{
            max = nums[n];
        }

        return max;
    }


}

//22 33 25 40 32 55 43 28
