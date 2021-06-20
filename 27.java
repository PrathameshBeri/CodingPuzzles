class Solution {
    public int removeElement(int[] nums, int val) {
        
        if(nums.length  < 1) return nums.length;
        
        // if(nums.length == 1){
        //     if(nums[0] == val) return 0;
        //     else return 1;
        // }
        
        int j = 0;
        int count = 0;
        for(int i = 0; i < nums.length ; i++){
            
            if(nums[i] == val){
                j = 1+i;
                while(j < nums.length){
                    if(nums[j] != val){
                        int temp = nums[j];
                        nums[j] = nums[i];
                        nums[i] = temp;
                        
                        break;
                    }
                    else{
                    j++;
                    }
                }
            }
            
        }
        for(int i = nums.length -1; i >= 0; i--){
            if(nums[i] == val) count++;
        }
        return nums.length - count ;
        
    }
}