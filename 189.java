class Solution {
    public void rotate(int[] nums, int k) {
        
        
        int r = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums,0,r -1);
        reverse(nums, r, nums.length -1 );
        
    }
    
    
    public void reverse(int[] numbers, int start, int end){
        while(start< end){
            int temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;
            start++;
            end--;         
        }
        
        
    }
}