class Solution {
    public int maxArea(int[] height) {
        
        
        int maxA = 0;
        int i =0;
        int j = height.length - 1;
        int low = 0;
        while(i < j){
            
            if(height[i] == low || height[i] < low){
                i++;
                continue;
            }else if(height[j] == low || height[j] < low ){
                j--;
                continue;
            }
            
            low = Math.min(height[i],height[j]);
                       
            maxA = Math.max(maxA, low * ( j - i ));
            
          
            
        }
        
        return maxA;
    }
}