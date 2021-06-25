class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int pos = binSearch(0,nums.length -1, nums,target);
       
        if(pos == -1) return new int[]{-1,-1};
        
        System.out.println(pos);
        int j = pos;
        int k = pos;
        
            while(j + 1 < nums.length){
                if(nums[j + 1] == target){
                    j++;
                    continue;
                }else{
                    
                    break;
                }
            }
            
        
        
              
            while(k -1 >= 0){
                if(nums[k - 1] == target){
                    k--;
                    continue;
                }else{
                    
                    break;
                }
            }
            
        
        
            return new int[]{k,j};
        
        
    }
    
    int binSearch(int l, int h, int[] nums, int target){
        if(l > h)
            return -1;
        
        else{
            
           int mid = l+((h-l)/2);
            
            //int mid = (h+l)/2;
            
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                return binSearch(mid+1,h,nums,target);
            }else{
                return binSearch(l,mid-1,nums,target);
            }
        }
        
    }
}