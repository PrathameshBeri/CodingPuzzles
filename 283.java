//283

class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;

        for(int i = 0; i < n; i++){

            if(nums[i] == 0){
                int y = i+1;
                while(y < n){

                    int l = nums[y];
                    if(l != 0){
                        int temp = nums[i];
                        nums[i] = nums[y];
                        nums[y] = temp;
                        break;
                    }
                        y++;

                }
            }

        }

    }
}
