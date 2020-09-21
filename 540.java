class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int len = nums.length;
        boolean found = false;
        int ans = 0;
        
        for(int i = 0; i < len-1; i +=2){
            
            if(nums[i] != nums[i+1]){
                ans = nums[i];
                found = true;
                break;
            }
            
        }
        
        if(ans == 0 && found == false){
            ans = nums[len-1];
        }
        
        return ans;
    }
}