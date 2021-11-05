class Solution {
    public int jump(int[] nums) {
        
        int[] jum = new int[nums.length];
        jum[0] = 0;  
        
        for(int i = 0; i < jum.length; i++){
            
            for(int j = 1; j <= nums[i]; j++){
               
                if(i+j < jum.length){
                    
                    if(jum[i+j ] == 0){
                        jum[i+j ] = jum[i] + 1;
                    }else{
                        jum[i+j] = Math.min(jum[i+j],jum[i] + 1);
                    }
              
                }
            }
           
        }
      
        return jum[nums.length - 1];
    }
}