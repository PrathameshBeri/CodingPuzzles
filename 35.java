class Solution {
    public int searchInsert(int[] nums, int target) {
        
        
        return binarySearch(0, nums.length, target, nums);
        
    }
    
    public int binarySearch(int low, int high, int target, int[] nums){
        
        if(low > high){
            return low;
        }else{
            
            int mid = low + (high - low)/2;
            
            if(mid > nums.length -1){return mid;}
            
            else if(nums[mid] == target){
                
                return mid;
            }else if(nums[mid] > target){
                
                return binarySearch(low, mid-1, target, nums);
            }else{
                
                return binarySearch(mid+1, high, target, nums);
            }
            
        }
        
    }
}