class Solution {
    public boolean canPartition(int[] nums) {

        int sum = Arrays.stream(nums).sum();
        System.out.println(sum);
        if(sum % 2 != 0 || nums.length < 2 )  return false;
        sum /=2;
        boolean[] sums = new boolean[sum + 1];
        
        List<Integer> repeat = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int cur = nums[i];
             if(cur > sum) {
                    return false;
                }
            repeat = new ArrayList<>();
            for(int j = 1; j <= sum; j++ ){
               
                if(sums[j] == true && j + cur <= sum  ){
                    if(j + cur == sum){
                        return true;
                    }
                    repeat.add(j+cur);
                } 
                
            }
            for(int l : repeat){
                sums[l] = true;
            }
            sums[cur] = true;
            
        }
        
        return sums[sum];
    }
}


//get the partition number
//Check if we need to include the element in he bag