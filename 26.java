class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums.length == 0) return 0;
        int current = 1;
        int prev = nums[0];
        for(int i = 1; i < nums.length; i++){
            
            if(nums[i] != prev){
                nums[current] = nums[i];
                current++;
                prev = nums[i];
            }
            
        }
        
        return current;
    }
    
    
}