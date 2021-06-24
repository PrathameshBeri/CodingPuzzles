class Solution {
    public boolean checkPossibility(int[] nums) {
        
        
        int differences = 0;
        int current = 0;
        for(int i = 0; i < nums.length-1; i++){
            
            if(nums[i] <= nums[i+1] ){
    
                continue;
            }else{
                differences++;
                if(differences > 1){
                    return false;
                }
                if((i - 1 >=0 && nums[i-1] > nums[i+1]) && (i + 2 < nums.length && nums[i] > nums[i+2])){
                    return false;
                }
            }
        }
        
        return differences > 1 ? false: true;
    }
}